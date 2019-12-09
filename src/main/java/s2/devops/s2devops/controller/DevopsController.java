package s2.devops.s2devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsController {
	
	@GetMapping(value="/devops")
	public String getResponse()
	{
		System.out.println("getResponse() method is called !!");
		return "Hello Devops from Spring Boot";
	}

}
