/**
 * 
 */
package com.cnblogs.hellxz.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hellxz
 *
 */
@SpringBootApplication
@RestController
public class SecurityDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityDemoApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello Spring Security";
	}

}
