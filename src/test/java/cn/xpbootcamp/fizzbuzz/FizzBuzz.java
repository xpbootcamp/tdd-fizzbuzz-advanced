package cn.xpbootcamp.fizzbuzz;

public class FizzBuzz {
    public String play(int number) {
        String result = "";
        if (number % 3 == 0) {
            result += "Fizz";
        }
        if (number % 5 == 0) {
            result += "Buzz";
        }
        if (number % 7 == 0) {
            return "Whizz";
        }
        return result.isEmpty() ? String.valueOf(number) : result;
    }
}
