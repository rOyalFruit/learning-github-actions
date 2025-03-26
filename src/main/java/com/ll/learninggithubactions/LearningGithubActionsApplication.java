package com.ll.learninggithubactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningGithubActionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningGithubActionsApplication.class, args); // 빌드 실패 테스트를 위해 세미콜론 누락
	}
}
