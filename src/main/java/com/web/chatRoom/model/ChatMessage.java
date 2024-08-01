package com.web.chatRoom.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessage {
    private MessageType type;
    String content;
    String sender;

    public enum MessageType{
        CHAT,
        JOIN,
        LEAVE
    }

}
