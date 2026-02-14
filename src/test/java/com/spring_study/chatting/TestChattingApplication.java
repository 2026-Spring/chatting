package com.spring_study.chatting;

import org.springframework.boot.SpringApplication;

public class TestChattingApplication {

	public static void main(String[] args) {
		SpringApplication.from(ChattingApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
