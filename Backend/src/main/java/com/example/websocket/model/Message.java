package com.example.websocket.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Document(collation = "messages")
public class Message {
    @Id
    private String id;
    private String senderName;
    private String receiverName;
    private String message;
    private String date;
    private Status status;

}
