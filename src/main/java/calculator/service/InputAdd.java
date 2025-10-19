package calculator.service;

public class InputAdd {

    public static long inputAdd(String[] input) {

        long sum = 0;
        for (String s : input) {
            sum += Long.parseLong(s);
        }

        return sum;
    }
}
