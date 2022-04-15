package com.bridgelabz;

public class MoodAnalyser {

    public static String analyseMood(String message) {
        String messageOne = "I am in Sad Mood";
        String messageTwo = "I am in any Mood";
        if (message.equalsIgnoreCase(messageOne))
            return "SAD";
        else if (message.equalsIgnoreCase(messageTwo))
            return "HAPPY";
        else
            return "No Match";
    }
}
