package Final;


import java.util.ArrayList;
import java.util.Arrays;

public class PigLatinTranslator {
    public static String translate(String english) {
        String[] words = english.split(" ");
        String pigLatin = "";
        for (String word : words) {
            pigLatin += TranslateBetweenLanguages(word) + " ";
        }
        return pigLatin.trim();
    }


    private static boolean VowelCheck(char c) {
        return "aeiou".indexOf(c) != -1;
    }

    private static boolean ConsonantCheck(String letters) {
        String[] consonantClusters = {"sh", "ch", "wh", "th", "ph", "qu", "rh"};
        boolean result = false;
        for (String consonantCluster : consonantClusters) {
            if (letters.equalsIgnoreCase(consonantCluster)) {
                result = true;
                break;
            }
        }
        return result;
    }

    private static boolean VowelStarts(String word) {
        boolean result;
        if (word.substring(0, 2).equalsIgnoreCase("xr")
                || word.substring(0, 2).equalsIgnoreCase("yt")) {
            result = true;
        } else {
            result = VowelCheck(word.charAt(0));
        }
        return result;
    }

    public static String TranslateBetweenLanguages(String input) {
        String result = "";
        if (input.isEmpty()) {
            System.out.println("Check your inputs");
            System.exit(1);
        } else {
            String[] wordArray = input.strip().split("\\s+");
            ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordArray));
            for (int index = 0; index < wordsList.size(); ++index) {
                String word = wordsList.get(index);
                if (VowelStarts(word)) {
                    String translatedLeadingVowel = word + "ay";
                    wordsList.set(index, translatedLeadingVowel);
                } else {
                    if (ConsonantCheck(word.substring(0, 2))) {
                        int leadingConsonantClusterChars = VowelCheck(word.charAt(2)) || Character.toLowerCase(word.charAt(2)) == 'y' ? 2 : 3;
                        String cluster = word.substring(0, leadingConsonantClusterChars);
                        String ending = (cluster + "ay").toLowerCase();
                        String translatedLeadingCluster = new StringBuilder(word).delete(0, leadingConsonantClusterChars).append(ending).toString();
                        wordsList.set(index, translatedLeadingCluster);
                    }
                    else if (word.length() > 2 && word.substring(1, 3).equalsIgnoreCase("qu")) {
                        String cluster = word.substring(0, 3);
                        String ending = (cluster + "ay").toLowerCase();
                        String translatedConsonantQU = new StringBuilder(word).delete(0, 3).append(ending).toString();
                        wordsList.set(index, translatedConsonantQU);
                    }
                    else if (word.length() == 2 && word.charAt(1) == 'y') {
                        String translatedToCharY = new StringBuilder(word).reverse().append("ay").toString().toLowerCase();
                        wordsList.set(index, translatedToCharY);
                    }
                    else {
                        String ending = ConsonantCheck(word.substring(1, 3)) ? word.substring(0, 3) + "ay" : word.charAt(0) + "ay";
                        String translatedWord;
                        if (ConsonantCheck(word.substring(1, 3))) {
                            translatedWord = new StringBuilder(word).append(ending).delete(0, 3).toString();
                        } else {
                            translatedWord = new StringBuilder(word).append(ending).deleteCharAt(0).toString();
                        }
                        wordsList.set(index, translatedWord);
                    }
                }
            }
            result = (wordsList.size() > 1) ? String.join(" ", wordsList) : wordsList.get(0);
        }
        return result;
    }

}

