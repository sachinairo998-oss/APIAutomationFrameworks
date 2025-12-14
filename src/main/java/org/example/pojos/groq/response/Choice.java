package org.example.pojos.groq.response;

public class Choice {

    private int index;
    private AssistantMessage message;
    private String finish_reason;

    public AssistantMessage getMessage() {
        return message;
    }
}