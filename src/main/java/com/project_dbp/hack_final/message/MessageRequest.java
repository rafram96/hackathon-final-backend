package com.project_dbp.hack_final.message;

import com.project_dbp.hack_final.chat.Chat;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageRequest {
    private String content;
    private Chat chatID;
    private Model aiModel;
}
