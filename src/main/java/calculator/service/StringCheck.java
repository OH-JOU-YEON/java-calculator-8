package calculator.service;


public class StringCheck {

    public static final String delimiter = "//(.)\\\\n(.*)";

    public static final String[] metaString ={"$","^","]","[","*","(",")","?","\\",".","|","}","{"};  ;


    public static boolean checkString(String input) {

        //문자열을 받아 형식을 검사하는 메서드

        if(input.matches(delimiter)) {

            String[] tokens = input.split("//|\\\\n");

            //정규식에 사용되는 메타문자를 구분자로 받았는지 검사
            for(String s : metaString) {
                if(tokens[1].equals(s))
                    tokens[1] = "\\" +  tokens[1];
            }

            String regex = "(^\\d)" + "(" + tokens[1] + "\\d)*(^\\d)?";

            String replaceDeli = input.replace("//" + tokens[1] + "\\n","");

            //숫자, 토큰이 반복적으로 나열되는지 확인

            return replaceDeli.matches(regex);


        }else {
            return input.matches("(^\\d)(^[,:]\\d])*(^\\d)?");
        }


    }









}