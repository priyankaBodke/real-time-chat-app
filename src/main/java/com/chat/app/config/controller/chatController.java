package com.chat.app.config.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.chat.app.config.model.ChatMessage;

@Controller
public class chatController {
	@MessageMapping("/sendMessage")//client send to this endpoint and send message () work
	@SendTo("/topic/messages") // conect the all brodacsted client
 public ChatMessage sendMessage(ChatMessage message) {
	 return message;
 }
	@GetMapping
	public String chat() {
		return "chat";
	}
}
