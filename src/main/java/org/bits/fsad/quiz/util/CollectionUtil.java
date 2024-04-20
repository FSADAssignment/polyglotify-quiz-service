package org.bits.fsad.quiz.util;

public class CollectionUtil {
    public static String getCollectionName(String language) {
        switch (language.toLowerCase()) {
            case "en":
                return "en";
            case "spa":
                return "spa";
            case "fr":
                return "fr";
            // Add cases for other languages as needed
            default:
                throw new IllegalArgumentException("Unsupported language: " + language);
        }
    }
}