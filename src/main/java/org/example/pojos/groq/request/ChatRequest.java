package org.example.pojos.groq.request;

import org.apache.logging.log4j.message.Message;

import java.util.List;

public class ChatRequest {

    private String model;
    private List<Message> messages;

    public ChatRequest() {
    }

    public ChatRequest(String model, List<Message> messages) {
        this.model = model;
        this.messages = messages;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
