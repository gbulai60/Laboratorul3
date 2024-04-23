package org.example.entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Paragraf {
    private String text;

    public Paragraf(String text) {
        this.text = text;
    }

    public Paragraf() {
        this.text = "";
    }
    public boolean searchPattern(String pattern) {
        Pattern pattern1 = Pattern.compile(pattern);
        Matcher matcher = pattern1.matcher(text);
        return matcher.find();
    }

    public boolean searchPattern(String pattern, boolean caseSensitive) {
        if (!caseSensitive) {
            pattern = pattern.toLowerCase();
            String lowercaseText = text.toLowerCase();
            return lowercaseText.contains(pattern);
        } else {
            return searchPattern(pattern);
        }
    }

    @Override
    public String toString() {
        return text;
    }
}

