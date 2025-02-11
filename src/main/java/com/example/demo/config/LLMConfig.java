/**
 * 
 */
package com.example.demo.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LLMConfig {
	@Bean
	ChatClient chatClientOpenIa(OpenAiChatModel model ){
		return ChatClient.create(model);
		
	}
	@Bean
	ChatClient ollamaChatClient(OllamaChatModel model ){
		return ChatClient.create(model);
		
	}

}
