package com.example.patterns.structural.bridge;

public class OnlineTranslator extends Translator {

    public OnlineTranslator(Language languageFrom, Language languageTo) {
        super(languageFrom, languageTo);
    }

    @Override
    public void translate() {
        System.out.printf("online translator translate from %s to %s\n", languageFrom.getName(), languageTo.getName());
    }
}
