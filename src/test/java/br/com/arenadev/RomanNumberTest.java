package br.com.arenadev;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by rogeralmeida on 3/10/2015.
 */
public class RomanNumberTest {
    @org.junit.Test
    public void testNumber1() throws Exception {
        verifyRomanNumber(1, "I");
    }

    @Test
    public void testNumber5() throws Exception {
        verifyRomanNumber(5, "V");
    }

    @Test
    public void testNumber10() throws Exception {
        verifyRomanNumber(10, "X");
    }

    @Test
    public void testNumbers50_100_500_1000() throws Exception {
        verifyRomanNumber(50, "L");
        verifyRomanNumber(100, "C");
        verifyRomanNumber(500, "D");
        verifyRomanNumber(1000, "M");
    }

    @Test
    public void testNumber2015() throws Exception {
        verifyRomanNumber(2015, "MMXV");
    }

    @Test
    public void testNumber7() throws Exception {
        verifyRomanNumber(7, "VII");
    }

    @Test
    public void testNumber4() throws Exception {
        verifyRomanNumber(4, "IV");
    }

    private void verifyRomanNumber(int number, String value) {
        RomanNumber romanNumber = new RomanNumber(number);
        assertThat(number+" should be "+value, romanNumber.toString(), equalTo(value));
    }
}
