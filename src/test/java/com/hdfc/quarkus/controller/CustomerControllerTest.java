package com.hdfc.quarkus.controller;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import jakarta.ws.rs.core.MediaType;

@QuarkusTest
class CustomerControllerTest {

	@Test
	void testAddCustomer() {
		
		String customerData = "{\"name\":\"demo2\",\"age\":22,\"address\":{\"city\":\"Nashik\",\"state\":\"MH\",\"pinCode\":\"422305\"}}";


		RestAssured.given()
		.contentType(MediaType.APPLICATION_JSON)
		.body(customerData)
		.when().post("/api/customer/add")
		.then()
		.statusCode(200);
	}

//	@Test
//	void testGetCustomer() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetAllCustomers() {
//		fail("Not yet implemented");
//	}

}
