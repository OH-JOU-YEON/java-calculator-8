package calculator;

import calculator.service.InputAdd;
import calculator.service.StringCheck;
import calculator.service.StringCut;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Application {
    public static void main(String[] args) {

        System.out.println("덧셈할 문자열을 입력해 주세요.");

       try {
           String input = readLine();

            if(!StringCheck.checkString(input)) {
               throw new IllegalArgumentException("잘못된 입력입니다");
           }

           String[] stringCut = StringCut.StringCut(input);

            long result = InputAdd.inputAdd(stringCut);

            System.out.println("결과 : " + result);

       } catch (IllegalArgumentException e) {
           System.out.println("에러메세지:" + e.getMessage());

       }





    }

}
