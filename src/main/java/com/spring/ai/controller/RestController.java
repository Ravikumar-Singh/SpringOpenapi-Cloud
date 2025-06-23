package com.spring.ai.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	
	private final ChatClient chatClient;
	
	public RestController(ChatClient.Builder chatClient) {
		
		this.chatClient = chatClient.build();
	}

	@GetMapping
	public String propmt(@RequestParam String message) {
		
		return chatClient.prompt(message).call().content();
	}
	
}
