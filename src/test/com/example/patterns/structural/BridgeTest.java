package com.example.patterns.structural;


import com.example.patterns.structural.bridge.*;
import org.junit.Test;

public class BridgeTest {

    @Test
    public void testBridge() {
        Translator russianToEnglish = new OnlineTranslator(new RussianLanguage(), new EnglishLanguage());
        russianToEnglish.translate();

        Translator englishToRussian = new OnlineTranslator(new EnglishLanguage(), new RussianLanguage());
        englishToRussian.translate();

        englishToRussian = new DesktopTranslator(new EnglishLanguage(), new RussianLanguage());
        englishToRussian.translate();
    }
}
