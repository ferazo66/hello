package ec.com.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	@GetMapping("/hola")
	public String hello() {
		return "hola mundo";
	}
	
}
