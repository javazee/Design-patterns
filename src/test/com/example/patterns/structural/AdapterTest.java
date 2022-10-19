package com.example.patterns.structural;

import com.example.patterns.structural.adapter.Moon;
import com.example.patterns.structural.adapter.Scientist;
import com.example.patterns.structural.adapter.ScientistAdapter;
import com.example.patterns.structural.adapter.Telescope;
import org.junit.Test;

public class AdapterTest {

    @Test
    public void testAdapter() {
        Scientist scientist = new Scientist("Elon");
        scientist.explore();

        Telescope scientistAdapter = new ScientistAdapter(scientist);

        scientistAdapter.exploreSpaceObject(new Moon("moon", 40000));

    }
}
