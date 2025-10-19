package calculator.service;

public class StringCut {

    public static String[] StringCut(String input) {

        if(input.matches(StringCheck.delimiter)) {
            String[] tokens = input.split("//|\\\\n");
            String delimiter = tokens[1];

            return input.replace("//" + tokens[1] + "\\n","").split(tokens[1]);

        }else {
            return input.split("[,:]");
        }
    }
}
