package com.deloitte.apivault.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkerController {

	@GetMapping("/")
	public String demo() {
		return "demo";
	}
	@GetMapping("/aa")
	public String demoa() {
		return "demo";
	}
}
