package org.example.ATJAVA.player;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.Random;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void loses_when_dice_number_is_low() {

        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(2);

        Player player = new Player(dice, 3);
        assertFalse(player.play()); //assertEquals(false, player.play());
    }
    @Test
    public void win_when_dice_number_is_low() {

        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(4);

        Player player = new Player(dice, 3);
        assertTrue(player.play()); //assertEquals(true, player.play());
    }

}