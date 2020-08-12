package cn.xpbootcamp.fizzbuzz;

public class FizzBuzz {
    public String play(int number) {
        String result = "";
        String numberStr = String.valueOf(number);
        if (numberStr.contains("3")) {
            return "Fizz";
        }
        if (number % 3 == 0) {
            result += "Fizz";
        }
        if (number % 5 == 0) {
            result += "Buzz";
        }
        if (number % 7 == 0) {
            result += "Whizz";
        }
        return result.isEmpty() ? String.valueOf(number) : result;
    }
}
