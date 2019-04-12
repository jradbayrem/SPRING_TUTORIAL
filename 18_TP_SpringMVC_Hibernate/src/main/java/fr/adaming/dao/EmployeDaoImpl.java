package fr.adaming.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import fr.adaming.model.Employe;

/**
 * 
 * @author INTI0261
 *
 */
@Repository
@Transactional
public class EmployeDaoImpl implements IEmployeDao {

	@Autowired // injection automatique
	private SessionFactory sessionFactory;

	/**
	 * setter pour injection spring
	 * 
	 * @param sessionFactory
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/**
	 * 
	 */
	@Override
	@Transactional(readOnly = false)
	public void addEmploye(Employe employe) {

		Session session = sessionFactory.openSession();
		session.save(employe);
	
	}

	/**
	 * 
	 */
	@Override
	@Transactional
	public void updateEmploye(Employe employe) {
		
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(employe);
		
//		String hqlUpdate = " UPDATE Employe e SET e.fonction = :eFonction "
//				         + " WHERE id = :eID";
//		Query query = session.createQuery(hqlUpdate);
//		query.setParameter("eFonction", employe.getFonction());
//		query.setParameter("eID", employe.getId());
//		
//		int result = query.executeUpdate();
//		System.out.println("Nombre d'employés MAJ : =================> " + result);
	}

	/**
	 * 
	 */
	@Override
	@Transactional
	public void deleteEmploye(Employe employe) {

		Session session = sessionFactory.openSession();
		
		String hqlDelete = "DELETE FROM Employe e WHERE e.id = :eID";
		
		Query query = session.createQuery(hqlDelete);
		query.setParameter("eID", employe.getId());
		
		int result = query.executeUpdate();
		
		System.out.println("Nombre d'employés supprimés : ======> " + result);
		
	}

	/**
	 * 
	 */
	@Override
	@Transactional(readOnly = true)
	public Employe getEmployeById(int idEmploye) {

		Session session = sessionFactory.openSession();
		String hqlReq = "FROM Employe WHERE id= :employeID";
		Query query = session.createQuery(hqlReq);
		query.setParameter("employeID", idEmploye);
		@SuppressWarnings("unchecked")
		List<Employe> empList = query.list();

		return empList.get(0);
	}

	/**
	 * 
	 */
	@Override
	@Transactional(readOnly = true)
	public List<Employe> getAllEmployes() {
	
		Session session = sessionFactory.openSession();
		//SELECT e.nom FROM Employe e 
		String hqlReq = "FROM Employe"; //ASC
		Query query = session.createQuery(hqlReq);

		@SuppressWarnings("unchecked")
		List<Employe> empList = query.list();
		
		return empList;
	}

}
