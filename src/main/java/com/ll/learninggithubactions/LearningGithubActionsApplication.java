package com.ll.learninggithubactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningGithubActionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningGithubActionsApplication.class, args);
		int a = 0;

		for (int i = a; i < 10; i++) {
			System.out.println(i);
		}
	}
}