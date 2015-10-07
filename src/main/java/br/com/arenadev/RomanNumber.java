package br.com.arenadev;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rogeralmeida on 3/10/2015.
 */
public class RomanNumber {
    private final Integer number;
    private final Map<Integer, String> romanNumbersMap = new HashMap<Integer, String>();

    public RomanNumber(Integer number) {
        this.number = number;
        this.romanNumbersMap.put(1, "I");
        this.romanNumbersMap.put(5, "V");
        this.romanNumbersMap.put(10, "X");
        this.romanNumbersMap.put(50, "L");
        this.romanNumbersMap.put(100, "C");
        this.romanNumbersMap.put(500, "D");
        this.romanNumbersMap.put(1000, "M");
    }

    @Override
    public String toString() {
        return this.romanNumbersMap.get(this.number);
    }
}
