package io.namya.springconfigserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greeting {
@Autowired
	@Value("${my.greet}")
	private String message;
	@GetMapping("/greet")
	public String greet() {
		return message;
	}
}
