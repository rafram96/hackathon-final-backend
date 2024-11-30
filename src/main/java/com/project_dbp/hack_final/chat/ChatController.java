package com.project_dbp.hack_final.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.project_dbp.hack_final.message.Message;
import java.util.List;

@RestController("/chat")
public class ChatController {

    @Autowired
    private ChatService chatService;

    @GetMapping
    public ResponseEntity<List<Chat>> getAllChats() {
        List<Chat> chats = chatService.getChats();
        return ResponseEntity.ok(chats);
    }

    @PostMapping
    public ResponseEntity<Chat> createChat(@RequestBody Chat chat) {
        Chat createdChat = chatService.crearChat(chat);
        return ResponseEntity.ok(createdChat);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<Message>> getMessagesByChatId(@PathVariable Long id) {
        List<Message> messages = chatService.getMessagesByChatId(id);
        return ResponseEntity.ok(messages);
    }

}
