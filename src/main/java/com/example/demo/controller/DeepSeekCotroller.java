/**
 * 
 */
package com.example.demo.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeepSeekCotroller {
	
	private final ChatClient chatClient;

	public DeepSeekCotroller(@Qualifier("ollamaChatClient") ChatClient  chatClient) {
		super();
		this.chatClient = chatClient;
	}
	
//	@GetMapping("/deppseek/{m}")
//	public String chat(@PathVariable String m) {
//		return this.chatClient.prompt().user(m).call().content();
//	}
	
	@GetMapping("/localdeppseek/{m}")
	public String localChat(@PathVariable String m) {
		return this.chatClient.prompt().user(m).call().content();
	}
	
	

}
