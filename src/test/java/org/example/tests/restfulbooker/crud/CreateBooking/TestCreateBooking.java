package org.example.tests.restfulbooker.crud.CreateBooking;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.restassured.RestAssured;
import org.example.base.BaseTest;
import org.example.endpoints.APIConstants;
import org.example.pojos.restfulbooker.response.BookingResponse;
import org.testng.annotations.Test;

public class TestCreateBooking extends BaseTest {


    @Test(groups = "reg", priority = 1)
    @Owner("Sachin M")
    @Description("TC#1 - Verify that the Booking can be Created")
    public void testCreateBookingPOST_Positive() {

        //  GIVEN
        // Setup will first and making the request - Part - 1
        requestSpecification.basePath(APIConstants.CREATE_UPDATE_BOOKING_URL);
        response = RestAssured
                .given(requestSpecification)
                // WHEN
                .when()
                .body(payloadManager.createPayloadBookingAsString()).post();


        //Extraction Part - 2
        BookingResponse bookingResponse = payloadManager.bookingResponseJava(response.asString());



        // THEN
        // Validation and verification via the AssertJ, TestNG Part - 3
        assertActions.verifyStatusCode(response,200);
        assertActions.verifyStringKeyNotNull(bookingResponse.getBookingid());
        assertActions.verifyStringKey(bookingResponse.getBooking().getFirstname(),"Pramod");




    }



}