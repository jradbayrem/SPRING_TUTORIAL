package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Employe;


/**
 * 
 *
 */
public interface IEmployeDao {

	String addEmploye(Employe employe);

	void updateEmploye(Employe employe);

	void deleteEmploye(Employe employe);

	Employe getEmployeById(int idEmploye);

	List<Employe> getAllEmployes();

}
