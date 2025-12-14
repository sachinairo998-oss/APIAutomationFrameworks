package org.example.pojos.groq.response;

import java.util.List;

public class ChatCompletionResponse {
    private String id;
    private String object;
    private long created;
    private String model;
    private List<Choice> choices;

    public List<Choice> getChoices() {
        return choices;
    }
}