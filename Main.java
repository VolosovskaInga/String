package com.company;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    static void processString() {
        String[] names = {"Computer", "Plate", "Chair", "Girl", "Boy",
                "Cat", "Dog", "Shirt", "Determination"};


        //how many values are starting with ‘C’
        int startsWithA = 0;
        int endsWithE = 0;
        int containsE = 0;


        for (String name : names) {
            if (name.startsWith("C")) {
                startsWithA++;
            }
        }
        System.out.println(startsWithA + " names start with letter C");
        //how many values are ending with “e”
        for (String name : names) {
            if (name.endsWith("e")) {
                endsWithE++;
            }
        }
        System.out.println(endsWithE + " name end with letter e");
        //how many values are with length 5
        int count = 0;
        for (String name : names) {
            if (name.length() == 5) {
                count++;
            }
        }
        System.out.println("There are " + count + " values with length 5");
        //Find out how many values consist of the character “e”;
        for (String name : names) {
            if (name.contains("e")) {
                containsE++;
            }
        }
        System.out.println("There are " + containsE + " values with letter e");
        //Find out is there any element which consists of the subString “te”;
        System.out.println();
        System.out.println("Elements that consist of “te”");
        int stringTe = 0;
        for (String name : names) {
            if (name.contains("te")) {
                System.out.println(names[stringTe]);
                stringTe++;
                System.out.println(stringTe + " word in the array");
            }
        }
        //Calculate a histogram of values related to length of value.
        System.out.println("HISTOGRAM (with the help of other colleagues)");
        int[] blankArr = new int[20];
        for (int i = 0; i < names.length; i++) {
            int howManyLetters = 0;
            for (String word : names) {
                if (i == word.length()) {
                    howManyLetters++;
                }
            }
            blankArr[i] = howManyLetters;
            if (howManyLetters != 0) {
                System.out.println(howManyLetters + " students with the grade " + i);
            }


        }
    }

    static void multipleActionsWithString() {
        String sentence = "Climb mountains not so the world can see you, but so you can see the world";
        String[] words = sentence.split("\\W+");
        System.out.println("There are " + words.length + " words in this sentence!");

        //how many “the” words are in the sentence
        int theCount = 0;
        for (String name : words) {
            if (name.equals("the")) {
                theCount++;
            }
        }
        System.out.println("There are " + theCount + " words 'the' in the sentence!");
        //how many words consists of the letter “s”
        int containS = 0;
        Pattern s = Pattern.compile("s");
        Matcher c = s.matcher(sentence);
        while (c.find()) {
            containS++;
        }
        System.out.println("There are " + containS + " words that contain 's'!");
        //Find out the words that are repeated in the sentence multiple times
        System.out.println();
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    if (j < i) {
                        break;
                    }
                    count++;
                }
            }
            if (count > 1) {
                System.out.println("Word '" + words[i] + "' occured " + count + " times");
            }

        }
        //Change the word “you” to “You”. Print out the new sentence.
        System.out.println();
        System.out.println("Changed sentence:");
        String my_new_str = sentence.replace("you", "You;");
        System.out.println(my_new_str);


    }

    static void assignment3() {
        //create a regex pattern for that (only letters are allowed)
        System.out.println("Are only letters in this string?");
        String name = "John";
        System.out.println(name.matches("[a-zA-Z]+"));
        //create a regex pattern for that (the first is a letter, after that 2 digits are allowed and after that
        //unlimited letters are allowed)
        System.out.println("Is this username correct?");
        String username = "s20surname";
        System.out.println(username.matches("[a-zA-Z]{1}[0-9]{2}[a-zA-Z]+"));
        //create a regex pattern for that (6 digits, after that - sign, after that 5 digits)
        System.out.println("Is this personal code correct?");
        String personCodeOfLatvian = "121200-11311";
        System.out.println(personCodeOfLatvian.matches("[0-9]{6}-[0-9]{5}"));
    }

    //assignment4()                NOT WORKING
    public enum Suits {
        Spade, Club, Heart, Diamond
    }

    public enum Rank {
        two, three, four, five, six, seven, eight, nine, ten, jack, queen, king, ace
    }

    class Card {
        Rank rank;
        Suits suit;

        Card(Rank r, Suits s) {
            rank = r;
            suit = s;
        }
    }

    List<Card> all() {
        List<Card> cards = new ArrayList<>();
        for (Rank r : Rank.values()) {
            for (Suits s : Suits.values()) {
                cards.add(new Card(r, s));
            }
        }
        return cards;
    }

    static void assignment4() {
    }
                        //TRIED TO DO IT IN ANOTHER WAY
    //String[] createPack = new String[52];

    //int i = 0;
    //for (Suits suits : Suits.values()) {
    //for (Rank rank : Rank.values()) {
    //   createPack[i++] = rank + "of" + suits;
    //   i++;
    // }

    // }
    //Random order = new Random();
    //String[] arr = new String[0];
    // for (int d = 0; d < createPack.length; d++) {

    // Collections.shuffle(Arrays.asList(createPack));
    //System.out.print("Enter the number of cards within:" + Arrays.asList(createPack).size() + " = ");


    static boolean assignment5(String palindrome) {
        int start = 0;
        int last = palindrome.length() - 1;

        palindrome = palindrome.toLowerCase();

        while (start <= last) {

            char getStart = palindrome.charAt(start);
            char getLast = palindrome.charAt(last);

            if (!(getStart >= 'a' && getStart <= 'z'))
                start++;

            else if (!(getLast >= 'a' && getLast <= 'z'))
                last--;

            else if (getStart == getLast) {
                start++;
                last--;
            }

            // If not equal the sentence is not palindrome
            else
                return false;
        }

        //If true is palindrome
        return true;
    }


    public static void main(String[] args) {
        //processString();
        //multipleActionsWithString();
        //assignment3();
        //assignment4();

        String palindrome = "Yo, banana boy! Hello";
        if (assignment5(palindrome))
            System.out.println("Sentence is palindrome!");
        else
            System.out.println("Sentence is not palindrome!");

    }


}