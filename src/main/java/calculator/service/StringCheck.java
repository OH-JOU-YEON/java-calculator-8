package calculator.service;


public class StringCheck {

    public static final String delimiter = "//(.)\\\\n(.*)";


    public static boolean checkString(String input) {

        //문자열을 받아 형식을 검사하는 메서드

        if(input.matches(delimiter)) {

            String[] tokens = input.split("//|\\\\n");

            String regex = "(^\\d)" + "(" + tokens[1] + "\\d)*(^\\d)?";


            String replaceDeli = input.replace("//" + tokens[1] + "\\n","");

            //숫자, 토큰이 반복적으로 나열되는지 확인

            return replaceDeli.matches(regex);


        }else {
            return input.matches("(^\\d)(^[,:]\\d])*(^\\d)?");
        }


    }









}