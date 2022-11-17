package com.cursor.HW7;

/**
 * This class implements methods that work with String and return the following data:
 * all the letters that make up the String and the number of their occurrences;
 * total number of letters; number of spaces; number of digits; number of punctuation marks
 */
public class StringProgram {

    public static void main(String[] args) {

        String st = "1. This is English string 2. Need to count letters and digits. !!!";
        System.out.println("The string is: " + st);
        int countLetter = 0;
        int countDigits = 0;
        int countSpaces = 0;
        int countPunctuation = 0;
        int countDoubles = 0;
        st = st.toLowerCase();

        /* The string is converted to an array of chars
         * and in a cycle we go through this array
         * and through the string and count the number of occurrences of each letter
         *
         */
        char[] ch = st.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < st.length(); j++) {
                if (ch[i] == st.charAt(j)) {
                    countDoubles++;
                }
            }
            System.out.println("The char " + ch[i] + " occurs " + countDoubles + " times.");
            countDoubles = 0;
        }

        /* Counting number of letters, spaces, punctuations and digits
         */
        for (int i = 0; i < st.length(); i++) {
            if (isLetter(st.charAt(i))) {
                countLetter++;
            } else if (isDigit(st.charAt(i))) {
                countDigits++;
            } else if (st.charAt(i) == ' ') {
                countSpaces++;
            } else if (isPunctuation(st.charAt(i))) {
                countPunctuation++;
            }
        }

        System.out.println("Number of letters in the string: " + countLetter);
        System.out.println("Number of digits in the string: " + countDigits);
        System.out.println("Number of spaces in the string: " + countSpaces);
        System.out.println("Number of punctuations in the string: " + countPunctuation);
    }

    /** The method is determined whether a char is a letter
     * @param ch - char into string
     * @return true if char is letter
     */
    private static boolean isLetter(char ch) {
        if ((ch != ' ') && (ch != ',') && (ch != '-') && (ch != '.') && (ch != '!') && (!isDigit(ch))) {
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
