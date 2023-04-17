package at.htlle.ficzkoArest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.annotation.PostConstruct;

public class LocationController {
	
	@PostConstruct
	public void init() {
		
	}
	
	@GetMapping("/location")
	public Location location(@RequestParam(value = "name", defaultValue = "Leoben") String name) {
		
		return null; //TODO
	}
}
