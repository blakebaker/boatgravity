package com.boatgravity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@RestController(value = "/")
	private class boatController{
		@GetMapping
		public String getABoat() {
			return "BLAKE needs a boat: Venmo @blaketbaker";
		}
	}

}
