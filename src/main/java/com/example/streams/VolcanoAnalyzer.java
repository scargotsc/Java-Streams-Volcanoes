package com.example.streams;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class VolcanoAnalyzer {

    public List<Volcano> volcanoes;

    public VolcanoAnalyzer() throws FileNotFoundException {
        
        BufferedReader bufferedReader = new BufferedReader(new FileReader(getFileFromResources("volcanoes.json")));
        volcanoes = new Gson().fromJson(bufferedReader, new TypeToken<ArrayList<Volcano>>() {
        }.getType());

    }

    // get file from classpath, resources folder
    private File getFileFromResources(String fileName) {

        ClassLoader classLoader = getClass().getClassLoader();

        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            return new File(resource.getFile());
        }

    }

    public void getMostCommonType(){

        // this gets the count of each type
        Map<String, Long> typeCount = volcanoes.stream().collect( groupingBy( Volcano::getType, counting() ));

        //Get the type with more repetitions
         String mostCommonType = typeCount.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        System.out.println( mostCommonType  + " " + typeCount.get(mostCommonType) );

    }



}
