package com.bridgelabz;

public class MoodAnalyser {
    static String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public static String analyseMood() {
        String messageOne = "I am in Sad Mood";
        String messageTwo = "I am in any Mood";
        try {
            if (message.equalsIgnoreCase(messageOne))
                return "SAD";
            else if (message.equalsIgnoreCase(messageTwo))
                return "HAPPY";
            else
                return "No Match";

        } catch (NullPointerException e) {
            return"HAPPY(null)";
        }
    }
}
