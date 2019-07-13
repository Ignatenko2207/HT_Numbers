package sjd.info.service;

import java.io.StringReader;

public class NumberService {

    public static int getSumByTypeManipulation(int number){
        int result =0;

        String numberAsText = String.valueOf(number);
        char[] symbols = numberAsText.toCharArray();
        for (char symbol : symbols) {
            result += Character.getNumericValue(symbol);
        }

        return result;
    }

    public static int getSumByDivision(int number){
        int result =0;

        while (number >0){
            result += number%10;
            number /= 10;
        }

        return result;
    }

    public static int getMaxPalindrome(int from, int to){
        if ( to < from ){
            return 0;
        }
        for (int i = to; i > from; i--) {
            for (int j = to; j > from; j--) {
                if (isPalindrome(i*j)){
                    return i*j;
                }
            }
        }
        return 0;
    }

    private static boolean isPalindrome(int number) {
        String numberAsText = String.valueOf(number);
        StringBuilder stringBuilder = new StringBuilder(numberAsText);
        if (numberAsText.equals(stringBuilder.reverse().toString())){
            return true;
        }
        return false;
    }

}
