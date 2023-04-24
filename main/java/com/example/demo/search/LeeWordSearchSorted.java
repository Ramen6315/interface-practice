package com.example.demo.search;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Comparator;

@Order(2)
@Component
public class LeeWordSearchSorted implements WordSearchSorted {
    @Override
    public boolean filterName(String name) {
        return name.startsWith("이");
    }

    @Override
    public Comparator<String> sort() {
        return Comparator.naturalOrder();
    }
}
