package com.example.patterns.structural;

import com.example.patterns.structural.composite.FootballPlayer;
import com.example.patterns.structural.composite.FootballTeam;
import com.example.patterns.structural.composite.Playable;
import org.junit.Test;

public class CompositeTest {

    @Test
    public void testComposite() {
        FootballTeam team = new FootballTeam("Real");
        for (int i = 1; i < 12; i++) {
            team.addPlayer(new FootballPlayer(i));
        }

        team.play();
        team.getPlayers().forEach(Playable::play);
    }
}
