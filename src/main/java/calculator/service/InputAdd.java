package calculator.service;

public class InputAdd {

    public static long inputAdd(String[] input) {

        long sum = 0;
        for(int i =0; i<input.length; i++) {
           sum += Long.parseLong(input[i]);
        }

        return sum;
    }
}
