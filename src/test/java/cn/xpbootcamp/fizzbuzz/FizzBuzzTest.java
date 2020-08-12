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

    @Test
    public void should_return_Fizz_when_play_game_given_number_divide_by_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.play(6);

        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void should_return_Buzz_when_play_game_given_number_divide_by_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.play(10);

        Assert.assertEquals("Buzz", result);
    }

    @Test
    public void should_return_Whizz_when_play_game_given_number_divide_by_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.play(14);

        Assert.assertEquals("Whizz", result);
    }

    @Test
    public void should_return_FizzBuzz_when_play_game_given_number_divide_by_15() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.play(60);

        Assert.assertEquals("FizzBuzz", result);
    }

    @Test
    public void should_return_FizzWhizz_when_play_game_given_number_divide_by_21() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.play(21);

        Assert.assertEquals("FizzWhizz", result);
    }

    @Test
    public void should_return_BuzzWhizz_when_play_game_given_number_divide_by_35() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.play(140);

        Assert.assertEquals("BuzzWhizz", result);
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_play_game_given_number_divide_by_105() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.play(210);

        Assert.assertEquals("FizzBuzzWhizz", result);
    }

    @Test
    public void should_return_Fizz_when_play_game_given_number_contain_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.play(13);

        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void should_return_Fizz_when_play_game_given_number_contain_3_and_divide_by_3_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.play(30);

        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void should_return_Buzz_when_play_game_given_number_contain_5_and_divide_by_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.play(15);

        Assert.assertEquals("Buzz", result);
    }

    @Test
    public void should_return_Whizz_when_play_game_given_number_contain_5_and_divide_by_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.play(56);

        Assert.assertEquals("Whizz", result);
    }

    @Test
    public void should_return_BuzzWhizz_when_play_game_given_number_contain_5_and_divide_by_7_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.play(35);

        Assert.assertEquals("BuzzWhizz", result);
    }

    @Test
    public void should_return_Fizz_when_play_game_given_number_contain_7_and_divide_by_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.play(75);

        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void should_return_Fizz_when_play_game_given_number_contain_7_and_divide_by_3_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.play(357);

        Assert.assertEquals("FizzWhizz", result);
    }

    @Test
    public void should_return_Fizz_when_play_game_given_number_contain_7_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.play(378);

        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void should_return_Fizz_when_play_game_given_number_contain_7_and_divide_by_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.play(70);

        Assert.assertEquals("Whizz", result);
    }
}
