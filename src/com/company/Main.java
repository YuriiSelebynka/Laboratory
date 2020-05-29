package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;

public class Main {

    public static void main(String[] args) throws IOException {

        String text = new String(Files.readAllBytes(Paths.get("C:/Users/Home/Desktop/harry.txt")));;

        String cleanedText = text.replaceAll("\\.", "")
                .replaceAll(",", "")
                .replaceAll("\\?", "")
                .replaceAll("\\.", "")
                .replaceAll("\\;", "")
                .replaceAll("\\:", "")
                //.replaceAll("\\'", "")
                //.replaceAll("\\-", "")
                .toLowerCase();

        String[] words = cleanedText.split(" ");

        String distinctString = "";

        for (int i = 0; i < words.length; i++) {
            if (!distinctString.contains(words[i])){
                distinctString += words[i] + " ";
            }
        }

        String [] distinctArray = distinctString.split(" ");

        Arrays.sort(distinctArray);

        for (int i = 0; i < distinctArray.length; i++) {
            //System.out.println(distinctArray[i]);
        }

        System.out.println(Arrays.stream(distinctString.split(" ")).max
                (Comparator.comparingInt(String::length)).orElse(null));

        boolean isHarry = false;
        int linesWithHarry = 0;

        for (int i = 4; i < text.length(); i++) {
            if ((text.charAt(i-4) == 'H') && (text.charAt(i-3) == 'a')
                    && (text.charAt(i-2) == 'r') && (text.charAt(i-1) == 'r')
                    && (text.charAt(i) == 'y')) {
                isHarry = true;
            }

            if ((text.charAt(i) == '.') && (isHarry)){
                linesWithHarry++;
                isHarry = false;

        Pattern pattern =
              Pattern.compile("\\w+", Pattern.UNICODE_CHARACTER_CLASS
                   | Pattern.CASE_INSENSITIVE);
              Matcher matcher = pattern.matcher(text);
              SortedSet<String> word = new TreeSet<>();
              while (matcher.find())
                  word.add(matcher.group().toLowerCase());
              for (String letters : word)
        System.out.println("word = " + letters);

        String common = "";
        for(int m=0;m<text.length();m++){
            for(int j=0;j<text.length();j++){
            if(text.charAt(m)==text.charAt(j)){
            common += text.charAt(m)+" ";
        break;
                    }
                }
            }
        System.out.println("common is: "+common);
                }
            }
        }
    }


