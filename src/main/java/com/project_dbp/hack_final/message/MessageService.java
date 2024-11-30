package com.project_dbp.hack_final.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public Message sendMessage(MessageRequest messageRequest) {
        Message message = new Message();
        message.setContent(messageRequest.getContent());
        message.setChatID(messageRequest.getChatID());
        message.setAiModel(messageRequest.getAiModel());
        message.setTimestamp(new Date());
        return messageRepository.save(message);
    }
}
