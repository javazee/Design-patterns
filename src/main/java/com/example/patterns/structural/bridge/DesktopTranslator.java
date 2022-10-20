package com.example.patterns.structural.bridge;

public class DesktopTranslator extends Translator{

    public DesktopTranslator(Language languageFrom, Language languageTo) {
        super(languageFrom, languageTo);
    }

    @Override
    public void translate() {
        System.out.printf("desktop translator translate from %s to %s\n", languageFrom.getName(), languageTo.getName());
    }
}
