package org.example.tests.groq;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.restassured.RestAssured;
import org.example.base.BaseTest;
import org.example.endpoints.APIConstants;
import org.example.pojos.groq.response.ChatCompletionResponse;
import org.testng.annotations.Test;

public class TestGROQChatResponse extends BaseTest {


    @Test(groups = "reg", priority = 1)
    @Owner("Sachin M")
    @Description("TC#1 - Verify GROW")
    public void test_GROQ_CHAT() {
        // Setup will first and making the request - Part - 1
        requestSpecification.baseUri(APIConstants.GROQ_BASE_URL);
        requestSpecification.basePath(APIConstants.GROQ_CHAT);
        requestSpecification.header("Authorization","Bearer <>");


        response = RestAssured.given(requestSpecification)
                .when().body(groqPayloadManger.setBuildRequest()).log().all()
                .post();

        //Extraction Part - 2
        ChatCompletionResponse chatCompletionResponse = groqPayloadManger.parseResponse(response.asString());

        // Validation and verification via the AssertJ, TestNG Part - 3
        String resonse_chat = chatCompletionResponse.getChoices().get(0).getMessage().getContent();

        assertActions.verifyStatusCode(response,200);
        assertActions.verifyStringKeyNotNull(resonse_chat);










    }



}
