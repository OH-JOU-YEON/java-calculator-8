package calculator.service;

public class StringCut {

    public static String[] stringCut(String input) {

        if(input.matches(StringCheck.delimiter)) {
            String[] tokens = input.split("//|\\\\n");
            String delimiter = tokens[1];

            String[] replaceDeli = input.split("n");



            return replaceDeli[1].split(tokens[1]);

        }else {
            return input.split("[,:]");
        }
    }
}
