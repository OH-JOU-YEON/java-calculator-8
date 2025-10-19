package calculator.service;

public class PlusAdd {

    public static long inputAdd(String[] input) {

        long sum = 0;
        for (String s : input) {
            long temp = Long.parseLong(s);
            //입력이 음수인지 검사
            if(temp<0) {
                throw new IllegalArgumentException("음수가 발견되었습니다.");
            }

            sum += temp;
        }

        return sum;
    }
}
