package com.falmeida.tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.falmeida.tech.environment.InstanceInformationService;

public class SampleController {
	
	@Autowired
	private InstanceInformationService service;

	@GetMapping(path = "/")
	public String imUpAndRunning() {
		return "{healthy:true}";
	}
	
	@GetMapping(path = "/sample")
	public String helloWorld() {
		return "Sample " + " V1 " + service.retrieveInstanceInfo();
	}

	@GetMapping(path = "/sample-bean")
	public SampleBean helloWorldBean() {
		return new SampleBean("Sample");
	}

	/// hello-world/path-variable/in28minutes
	@GetMapping(path = "/sample/path-variable/{name}")
	public SampleBean helloWorldPathVariable(@PathVariable String name) {
		return new SampleBean(String.format("Sample %s", name));
	}
	
}
