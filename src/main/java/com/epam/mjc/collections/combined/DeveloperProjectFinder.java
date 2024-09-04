package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> listOfProjects = new ArrayList<>();

        for (Map.Entry<String, Set<String>> entry : projects.entrySet()){
            if (entry.getValue().contains(developer)) {
                listOfProjects.add(entry.getKey());
            }
        }
        listOfProjects.sort(Comparator.comparingInt(String::length).reversed()
                .thenComparing(Comparator.reverseOrder()));
        return listOfProjects;
    }
}
