package com.javatechie.trymysql.contoller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;

//test for price
@AutoConfigureMockMvc
@SpringBootTest
class OrderControllerintTest {

    @Autowired
    private MockMvc mvc;
    @Test
    void showordernames() throws Exception {
        RequestBuilder request= MockMvcRequestBuilders.get("/price");
        MvcResult result=mvc.perform(request).andReturn();
        assertEquals("3968.0",result.getResponse().getContentAsString());
    }
}