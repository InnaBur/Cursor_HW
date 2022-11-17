package com.cursor.HW7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/** The class implements a program that accepts a text file as an input
 * and returns the following information:
 * the shortest word and the number of its repetitions in the text
 * (the one that is earlier alphabetically is returned);
 * the longest word and the number of its repetitions in the text
 * (the one that is later in the alphabet is returned).
 */
public class TextFromTheFileProgram {

    public static void main(String[] args) {
        String line;
        ArrayList<String> text = new ArrayList<>();

        /* Reading file and writing all words (without spaces and punctuations)
         * into array list
         */
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/com/cursor/HW7/file/txt.txt"));

            while ((line = br.readLine()) != null) {
                String words = "";
                for (int i = 0; i < line.length(); i++) {
                    if ((isLetter(line.charAt(i)))) {
                        words += line.charAt(i);
                    } else if (words.length() > 0) {
                            text.add(words.toLowerCase());
                            words = "";
                    }
                }
                if (words.length() > 0) {
                    text.add(words.toLowerCase());

                }
            }
            br.close();
            System.out.println(text);
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Something went wrong!" + e.getMessage());
        }

        String longestWord = longestWord(text);
        int countLongest = numberInText(text, longestWord);
        String shortestWord = shortestWord(text);
        int countShortest = numberInText(text, shortestWord);

        System.out.println("The text size is: " + text.size());
        System.out.println("The longest word in the text is: " + longestWord);
        System.out.println("Number of longest words in text: " + countLongest);
        System.out.println("--------------------------------------------");
        System.out.println("The shortest word in the text is: " + shortestWord);
        System.out.println("Number of shortest words in text: " + countShortest);

    }

    /** The method counts the number of occurrences of a given word in the text
     *
     * @param text array list with the text
     * @param word needed word
     * @return number of occurrences
     */
    private static int numberInText(ArrayList<String> text, String word) {
        int count = 0;
        for (String w : text) {
            if (w.equals(word)) {
                count++;
            }
        }
        return count;

    }

    /**
     * In the method array list for all longest words is created
     * Then array list into array for using sort method
     *
     * @param longestWord needed word
     * @param text array list with the text
     */
    private static String longestWordSort(String longestWord, ArrayList<String> text) {

        ArrayList<String> forLongest = new ArrayList<>();
        for (String w : text) {
            if (w.length() == longestWord.length()) {
                forLongest.add(w);
            }
        }
        String[] a = new String[forLongest.size()];
        System.arraycopy(forLongest.toArray(), 0, a, 0, a.length);
        Arrays.sort(a);
        return a[a.length - 1];
    }

    /** The method finds the longest word in the text
     *
     * @param text array list with the text
     * @return the longest word
     */
    private static String longestWord(ArrayList<String> text) {
        String longestWord = text.get(0);
        for (String word : text) {

            if (word.length() > longestWord.length()) {
                longestWord = word;
            } else if (word.length() == longestWord.length()) {
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) > longestWord.charAt(i)) {
                        longestWord = word;
                        break;
                    }
                }
            }
        }
        longestWord = longestWordSort(longestWord, text);
        return longestWord;
    }

    /** In the method array list for all shortest words is created
     * Then array list into array for using sort method
     *
     * @param shortesWord the shortest word
     * @param text array list with the text
     * @return the shortest word sorted from the first letter
     */
    private static String shortedWordSort(String shortesWord, ArrayList<String> text) {

        ArrayList<String> forShortest = new ArrayList<>();
        for (String w : text) {
            if (w.length() == shortesWord.length()) {
                forShortest.add(w);
            }
        }
        String[] a = new String[forShortest.size()];
        System.arraycopy(forShortest.toArray(), 0, a, 0, a.length);
        Arrays.sort(a);
        return a[0];
    }

    /** The method finds the shortest word in the text
     *
     * @param text array list with the text
     * @return the shortest word in the text
     */
    private static String shortestWord(ArrayList<String> text) {
        String shortestWord = text.get(0);
        for (String word : text) {

            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            } else if (word.length() == shortestWord.length()) {
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) > shortestWord.charAt(i)) {
                        shortestWord = word;
                        break;
                    }
                }
            }
        }
        shortestWord = shortedWordSort(shortestWord, text);
        return shortestWord;
    }

    /** The method is determined whether a char is a letter
     * @param ch - char into string
     * @return true if char is letter
     */
    private static boolean isLetter(char ch) {
        if ((ch != ' ') && (ch != ',') && (ch != '—') && (!isPunctuation(ch)) && (!isDigit(ch))) {
            return true;
        }
        return false;
    }

    /** The method is determined whether a char is a digit
     * @param ch - char into string
     * @return true if char is a digit
     */
    private static boolean isDigit(char ch) {
        int zeroChar = 48;
        int nineChar = 57;
        if ((ch >= zeroChar) && (ch <= nineChar)) {
            return true;
        }
        return false;
    }

    /** The method is determined whether a char is a punctuation using ASCII
     * @param ch - char into string
     * @return true if char is a punctuation
     */
    private static boolean isPunctuation(char ch) {
        int punctChar = 58;
        int punct1Char = 63;
        int punct2Char = 33;
        int punct3Char = 47;
        if (((ch >= punctChar) && (ch <= punct1Char)) ||
                ((ch >= punct2Char) && (ch <= punct3Char))) {
            return true;
        }
        return false;
    }
}
