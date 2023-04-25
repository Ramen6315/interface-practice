package com.example.demo.search;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Comparator;

@Order(2)
@Component
public class KimWordSearchSorted implements WordSearchSorted {
    @Override
    public boolean filterName(String name) {
        return name.startsWith("김");
    }

    @Override
    public Comparator<String> sort() {
        return Comparator.naturalOrder();
    }
}
