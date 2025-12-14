package org.example.tests.vwo;


import io.restassured.RestAssured;
import org.example.base.BaseTest;
import org.example.endpoints.APIConstants;
import org.example.modules.vwo.VWOPayloadManager;
import org.example.pojos.vwo.response.LoginResponse;
import org.testng.annotations.Test;

public class TestVWOLogin extends BaseTest {

    @Test
    public void test_VWO_Login(){

        requestSpecification.baseUri(APIConstants.VWO_BASE_URL);
        requestSpecification.basePath(APIConstants.VWO_LOGIN_URL);

        response = RestAssured.given(requestSpecification)
                .when().body(VWOPayloadManager.setLoginData()).log().all()
                .post();

        //Extraction Part - 2
        LoginResponse loginResponse = VWOPayloadManager.getLoginData(response.asString());

        // Validation and verification via the AssertJ, TestNG Part - 3
        assertActions.verifyStatusCode(response,200);
//        String pwd = System.getenv("PASSWORD_HIDDEN");


    }
}

