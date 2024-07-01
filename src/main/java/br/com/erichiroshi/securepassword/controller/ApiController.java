package br.com.erichiroshi.securepassword.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.erichiroshi.securepassword.controller.dto.BodyRequest;
import br.com.erichiroshi.securepassword.service.PasswordService;

@RestController
public class ApiController {

	private final PasswordService passwordService;

	public ApiController(PasswordService passwordService) {
		this.passwordService = passwordService;
	}

	@PostMapping
	public ResponseEntity<List<String>> isSafe(@RequestBody BodyRequest request) {
		 List<String> failures = passwordService.validate(request.password());

		if (failures.isEmpty()) {
			return ResponseEntity.noContent().build();
		}

		return ResponseEntity.badRequest().body(failures);
	}
}