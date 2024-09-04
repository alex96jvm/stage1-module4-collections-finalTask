package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
        public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
            Map<Integer, Set<String>> map = new HashMap<>();

            for (String word : sourceMap.keySet()) {
                int wordLength = word.length();
                map.putIfAbsent(wordLength, new HashSet<>());
                map.get(wordLength).add(word);
            }
            return map;
        }
}
