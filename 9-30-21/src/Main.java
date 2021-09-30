import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Scanner scan;
    private static String[] text;

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/data.txt");
        scan = new Scanner(file);

        String inputFromFile = "";

        while (scan.hasNextLine())                                // checks if theres more lines in the file
        {
            inputFromFile += scan.nextLine();                     // adds each line to the inputFromFile string.
        }

        text = inputFromFile.split(" ");                    // Creates and array of strings, where each element is a single word from the file.
        System.out.println(text.length);

        //printWordsStartingWith("");

        //printWordsOfLength();


        //test dine metoder ved at kalde dem her:
        //printEveryWord();
        //printLongestWord();
       // printMostFrequentLetter();
        printLessFrequentLetter();


    }

    private static void printWordsOfLength(int l) {
        boolean wordisvalid = true;

        for (String s : text) {
            if (s.length() == l) {
                if (s.contains(",") || s.contains(".")) {
                    wordisvalid = false;
                }

                if (wordisvalid) {
                    System.out.println(s);
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern) {
        for (String s : text) // for each word in text
        {
            if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase())) {
                System.out.println(s);
            }
        }
    }

    //skriv dine metoder herunder:
    private static void printEveryWord() {

        boolean wordIsValid = true;

        for (String s : text) {

            System.out.println(s);
        }
    }

    private static void printLongestWord() {
        String longestWord = "";
        for (String s : text) {
            if (s.length() > longestWord.length()) {
                longestWord = s;
            }
        }
        System.out.println(longestWord);
    }

    private static void printFirstHalfOfEachWord() {
        for (String s : text) {
            s = s.substring(0, s.length() / 2);
            System.out.println(s);
        }
    }

    private static void printMostFrequentLetter() {
        Map<Character, Integer> letters = new HashMap<>();
        letters.put(' ',0);
        for (String s : text) {
            for (char a : s.toLowerCase().toCharArray()) {
                if (Character.isLetter(a)) {
                    if (letters.containsKey(a)) {
                        letters.put(a, letters.get(a) + 1);
                    } else {
                        letters.put(a, 1);
                    }
                }
            }
        }
        char mostFrequentLetter = ' ';
        for(char c : letters.keySet()){
           if (letters.get(c) > letters.get(mostFrequentLetter)) {
               mostFrequentLetter = c;
           }
        }
        System.out.println(mostFrequentLetter + " : " + letters.get(mostFrequentLetter));


    }
    static void printLessFrequentLetter(){
        Map<Character, Integer> letters = new HashMap<>();
        letters.put(' ',100);
        for (String s : text) {
            for (char a : s.toLowerCase().toCharArray()) {
                if (Character.isLetter(a)) {
                    if (letters.containsKey(a)) {
                        letters.put(a, letters.get(a) + 1);
                    } else {
                        letters.put(a, 1);
                    }
                }
            }
        }
        char lessFrequent = ' ';
        for (char c : letters.keySet()){
            if ( letters.get(c) < letters.get(lessFrequent)) {
                lessFrequent = c;
            }
        }
        System.out.println(lessFrequent + " : " + letters.get(lessFrequent));
    }
}


