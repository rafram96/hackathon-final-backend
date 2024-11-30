package com.project_dbp.hack_final.message;

import jakarta.persistence.GeneratedValue;
import com.project_dbp.hack_final.chat.Chat;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "chat_id", nullable = false)
    private Chat chatID;

    private String content;

    private Date date;
}
