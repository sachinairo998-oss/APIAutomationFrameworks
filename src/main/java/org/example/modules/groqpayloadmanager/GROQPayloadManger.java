package org.example.modules.groqpayloadmanager;

import com.google.gson.Gson;
import org.apache.logging.log4j.message.Message;
import org.example.pojos.groq.request.ChatRequest;
import org.example.pojos.groq.response.ChatCompletionResponse;

import java.util.Collections;

public class GROQPayloadManger {
    static Gson gson;

    public void buildRequest() {
        ChatRequest chatRequest = new ChatRequest();
        chatRequest.setModel("openai/gpt-oss-120b");
        Message message = new Message("user", "Explain the POJO");
        chatRequest.setMessages(Collections.singletonList(message));
    }

    public String setBuildRequest() {
        gson = new Gson();
        ChatRequest chatRequest = new ChatRequest();
        chatRequest.setModel("openai/gpt-oss-120b");
        Message message = new Message("user", "Explain the POJO");
        chatRequest.setMessages(Collections.singletonList(message));
        return gson.toJson(chatRequest);
    }

    public static ChatCompletionResponse parseResponse(String jsonResponse) {
        gson = new Gson();
        return gson.fromJson(jsonResponse, ChatCompletionResponse.class);
    }
}
