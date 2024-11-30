package com.project_dbp.hack_final.chat;

import com.project_dbp.hack_final.message.Message;
import com.project_dbp.hack_final.message.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;



@Service
public class ChatService {
    @Autowired
    private ChatRepository chatRepository;

    @Autowired
    private MessageRepository messageRepository;

    public List<Chat> getChats() {
        return chatRepository.findAll();
    }

    public Chat crearChat(Chat chat) {
        return chatRepository.save(chat);
    }

    public List<Message> getMessagesByChatId(Long chatId) {
        return messageRepository.findByChatId(chatId);
    }
}
