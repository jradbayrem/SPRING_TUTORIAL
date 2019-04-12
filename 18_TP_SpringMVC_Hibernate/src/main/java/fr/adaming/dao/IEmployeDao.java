package fr.adaming.dao;

import java.util.List;
import fr.adaming.model.Employe;

/**
 * 
 * @author INTI0261
 *
 */
public interface IEmployeDao {

	void addEmploye(Employe employe);

	void updateEmploye(Employe employe);

	void deleteEmploye(Employe employe);

	Employe getEmployeById(int idEmploye);

	List<Employe> getAllEmployes();

}
