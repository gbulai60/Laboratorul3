package org.example.entity;

import java.util.ArrayList;
import java.util.List;

public class Pagina extends Paragraf{
    private List<Paragraf> paragrafe;

    public Pagina() {
        this.paragrafe = new ArrayList<>();
    }

    public void addParagraf(Paragraf paragraf) {
        paragrafe.add(paragraf);
    }

    @Override
    public boolean searchPattern(String pattern) {
        for (Paragraf paragraf : paragrafe) {
            if (paragraf.searchPattern(pattern)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Paragraf paragraf : paragrafe) {
            sb.append(paragraf).append("\n");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Pagina other)) {
            return false;
        }
        return this.paragrafe.equals(other.paragrafe);
    }
}
