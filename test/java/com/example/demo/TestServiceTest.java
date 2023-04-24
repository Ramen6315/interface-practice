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
    @Autowired
    List<WordSearchSorted> wordSearchSorteds = List.of(
        new LeeWordSearchSorted(),
        new KimWordSearchSorted(),
        new JangWordSearchSorted(),
        new BakWordSearchSorted()
    );

    private final TestService testService = new TestService(wordSearchSorteds);

    @Test
    @DisplayName("")
    public void test() {
        List<String> strings = testService.notOcp();
        for (String string : strings) {
            System.out.println(string);
        }
    }

    @Test
    @DisplayName("")
    public void testOcp() {
        List<String> strings = testService.sortOcp();
        for (String string : strings) {
            System.out.println(string);
        }
    }
}