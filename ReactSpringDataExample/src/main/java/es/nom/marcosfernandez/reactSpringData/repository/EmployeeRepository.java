/**
 * 
 */
package es.nom.marcosfernandez.reactSpringData.repository;

import org.springframework.data.repository.CrudRepository;

import es.nom.marcosfernandez.reactSpringData.model.Employee;

/**
 * @author marcos.fernandez
 *
 *	Extend CrudRepository instead of Repository to expose CRUD methods for Employee domain
 *
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
