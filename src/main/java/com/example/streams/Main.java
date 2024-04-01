package com.example.streams;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Main {

    public static void main(String[] args) {

        VolcanoAnalyzer volcanoAnalyzer = null;
        try {
            volcanoAnalyzer = new VolcanoAnalyzer();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        volcanoAnalyzer.volcanoes.forEach(System.out::println);

        /*
           1     Return the volcanoes that erupted in the 1970s.
           2     Return an array of the names of volcanoes that had an eruption with a Volcanic Explosivity Index (VEI) of 7 or higher.
           3     Return the eruption with the highest number of recorded deaths.
           4     Return the percentage of eruptions that caused mudflows (Agent_Code "M" for Mudflow).
           5     Return the most common type of volcano in the set.
           6     Return the number of eruptions when supplied a country as an argument.
           7     Return the average elevation of all eruptions.
           8     Return an array of types of volcanoes.
           9     Return the percentage of eruptions that occurred in the Northern Hemisphere.
           10     Return the names of eruptions that occurred after 1900, that did NOT cause a mudflow, happened in the Southern Hemisphere, and had a VEI of 5.
           11    Return the names of eruptions that occurred at or above an elevation passed in as an argument.
           12     Return the agents of death for the ten most deadly eruptions.
        * */


         volcanoAnalyzer.getMostCommonType();





    }

}
