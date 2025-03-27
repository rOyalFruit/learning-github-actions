package com.ll.learninggithubactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LearningGithubActionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningGithubActionsApplication.class, args); // 빌드 실패 테스트를 위해 세미콜론 누락
	}

	@GetMapping("/")
	public String hello() {
		return "Hello, World! test2";
	}
}
