package cn.xpbootcamp.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void should_return_number_self_when_play_game_given_common_number() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.play(4);

        Assert.assertEquals("4", result);
    }
}
