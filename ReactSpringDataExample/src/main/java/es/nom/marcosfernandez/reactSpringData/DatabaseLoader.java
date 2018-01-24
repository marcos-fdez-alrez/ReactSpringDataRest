/**
 * 
 */
package es.nom.marcosfernandez.reactSpringData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import es.nom.marcosfernandez.reactSpringData.model.Employee;
import es.nom.marcosfernandez.reactSpringData.repository.EmployeeRepository;

/**
 * @author marcos.fernandez
 *
 */
@Component
public class DatabaseLoader implements CommandLineRunner {
	
	
	private final EmployeeRepository repository;
	
	@Autowired
	public DatabaseLoader(EmployeeRepository repository) {
		this.repository = repository;
	}

	/* (non-Javadoc)
	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
	 */
	@Override
	public void run(String... arg0) throws Exception {
		Employee empleado = new Employee();
		empleado.setFirstName("name");
		empleado.setLastName("lastName");
		empleado.setDescription("description");
		this.repository.save(empleado);

	}

}
