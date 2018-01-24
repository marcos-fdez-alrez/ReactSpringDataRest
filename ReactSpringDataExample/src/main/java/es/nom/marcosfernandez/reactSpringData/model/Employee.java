/**
 * 
 */
package es.nom.marcosfernandez.reactSpringData.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author marcos.fernandez
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {

	private @Id @GeneratedValue Long id;
	private String firstName;
	private String lastName;
	private String description;

}
