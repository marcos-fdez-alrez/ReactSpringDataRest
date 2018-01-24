/**
 * 
 */
package es.nom.marcosfernandez.reactSpringData.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author marcos.fernandez
 *
 */
@Controller
public class MainController {

	/**
	 * 
	 */
	@RequestMapping(value="/")
	public String index() {
		return "index";
	}

}
