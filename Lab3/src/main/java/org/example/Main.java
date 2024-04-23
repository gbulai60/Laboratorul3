package org.example;

import org.example.entity.Paragraf;

public class Main {
    public static void main(String[] args) {
        Paragraf firstParagraf = new Paragraf("A fost odata ca niciodata");
        System.out.println(firstParagraf.searchPattern("fost"));
    }
}