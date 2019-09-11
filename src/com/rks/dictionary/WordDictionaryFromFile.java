package com.rks.dictionary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordDictionaryFromFile {

    public static void main(String[] args) {

        try {

            FileReader fr = new FileReader("data/test.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            ArrayList arrayListWords = new ArrayList();

            while ((line = br.readLine()) != null) {
                String temp = line.toLowerCase();
                //System.out.println("######## s ######### :: " + temp);

                String[] wordsInLine = temp.split("\\W+");
                arrayListWords.addAll(Arrays.asList(wordsInLine));

                //System.out.println(arrayListWords);
            }
            removeDuplicatesAndNull(arrayListWords);
            Collections.sort(arrayListWords);
            System.out.println(arrayListWords);



        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void removeDuplicatesAndNull(ArrayList arrayList) {
        HashSet h = new HashSet(arrayList);
        h.remove("");
        arrayList.clear();
        arrayList.addAll(h);
    }
}
