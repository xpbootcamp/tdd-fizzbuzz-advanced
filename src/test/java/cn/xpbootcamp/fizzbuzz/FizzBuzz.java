package cn.xpbootcamp.fizzbuzz;

public class FizzBuzz {
    public String play(int number) {
        String result = "";
        String numberStr = String.valueOf(number);
        boolean isContains3 = numberStr.contains("3");
        boolean isContains5 = numberStr.contains("5");
        boolean isContains7 = numberStr.contains("7");

        if (!isContains5 && isContains3) {
            return "Fizz";
        }
        if ((!isContains5 || isContains7) && number % 3 == 0) {
            result += "Fizz";
        }
        if (!isContains7 && number % 5 == 0) {
            result += "Buzz";
        }
        if (number % 7 == 0) {
            result += "Whizz";
        }
        return result.isEmpty() ? numberStr : result;
    }
}
