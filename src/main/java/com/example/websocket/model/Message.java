package com.example.websocket.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Message {
    private String name;
    private String Cellphone;
    private String email;
    private String message;
    private Status status;

}
