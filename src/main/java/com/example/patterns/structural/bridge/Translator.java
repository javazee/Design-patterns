package com.example.patterns.structural.bridge;

public abstract class Translator {

    protected  Language languageFrom;
    protected  Language languageTo;

    public Translator(Language languageFrom, Language languageTo) {
        this.languageFrom = languageFrom;
        this.languageTo = languageTo;
    }

    public abstract void translate();
}
