package br.com.arenadev;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rogeralmeida on 3/10/2015.
 */
public class RomanNumber {
    private final Integer number;
    private static final String[] LETTERS = {"M", "D", "C", "L", "X", "V", "I"};
    private static final Integer[] NUMBERS = {1000, 500, 100, 50, 10, 5, 1};

    public RomanNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        //2015
        //M | 1015
        //M | 15
        //X | 5
        //V | 0
        Integer rest = this.number;
        String result = "";
        while (rest > 0) {
            for (int i = 0; i < NUMBERS.length; i++) {
                Integer currentNumber = NUMBERS[i];
                if (currentNumber <= rest) {
                    result += LETTERS[i];
                    rest = rest - currentNumber;
                    break;
                }
            }
        }
        return result;
    }
}
