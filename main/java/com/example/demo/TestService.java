package com.example.demo;

import com.example.demo.search.WordSearchSorted;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TestService {
    private final List<WordSearchSorted> wordSearchSorteds;

    public TestService(List<WordSearchSorted> wordSearchSorteds) {
        this.wordSearchSorteds = wordSearchSorteds;
    }

    public List<String> notOcp() {
        Names userNames = new Names();
        List<String> names = userNames.getNames();
        List<String> results = new ArrayList<>();
        List<String> startKims = names.stream()
            .filter(name -> name.startsWith("김"))
            .sorted(Comparator.naturalOrder())
            .toList();

        List<String> startsLees = names.stream()
            .filter(name -> name.startsWith("이"))
            .sorted(Comparator.naturalOrder())
            .toList();

        List<String> startBaks = names.stream()
            .filter(name -> name.startsWith("박"))
            .sorted(Comparator.naturalOrder())
            .toList();

        List<String> startJangs = names.stream()
            .filter(name -> name.startsWith("장"))
            .sorted(Comparator.naturalOrder())
            .toList();

        results.addAll(startKims);
        results.addAll(startsLees);
        results.addAll(startBaks);
        results.addAll(startJangs);

        return results;

    }
    public List<String> sortOcp() {
        Names userNames = new Names();
        List<String> names = userNames.getNames();
        List<String> results = new ArrayList<>();
        for (WordSearchSorted sorted : wordSearchSorteds) {
            List<String> filteredAndSortedNames = names.stream()
                .filter(sorted::filterName)
                .sorted(sorted.sort())
                .toList();

            results.addAll(filteredAndSortedNames);
        }
        return results;
    }

}
