package com.example.demo.search;

import java.util.Comparator;

public interface WordSearchSorted {
    boolean filterName(String name);

    Comparator<String> sort();
}
