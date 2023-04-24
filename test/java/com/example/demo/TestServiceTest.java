package com.example.demo;

import com.example.demo.search.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@SpringBootTest
class TestServiceTest {

    private final TestService testService = new TestService();

    @Test
    @DisplayName("")
    public void test() {
        List<String> strings = testService.notOcp();
        for (String string : strings) {
            System.out.println(string);
        }
    }
}