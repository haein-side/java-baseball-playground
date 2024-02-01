package study;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    public void isSeperatedToStringArray() {
        //given
        String testCase = "1,2";
        //when
        String[] result = testCase.split(",");
        //then
        String[] expectedResult = {"1", "2"};
        assertThat(result).contains(expectedResult);
    }

    @Test
    public void isSeperatedToNumber() {
        //given
        String testCase = "1";
        //when
        String[] result = testCase.split(",");
        //then
        assertThat(result).containsExactly("1");
    }

    @Test
    public void isSubString() {
        //given
        String testCase = "(1,2)";
        //when
        String result = testCase.substring(1, testCase.length()-1);
        //then
        assertThat(result).isEqualTo("1,2");
    }

    @Test
    public void getCharacter() {
        //given
        String testCase = "abc";
        //when
        char result = testCase.charAt(1);
        //then
        assertThat(result).isEqualTo('b');
    }

    @Test
    public void canNotGetCharacter() {
        //given
        String testCase = "abc";
        //when, then
        assertThatThrownBy(()-> testCase.charAt(testCase.length()))
                .isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range")
                .hasMessageContaining(String.valueOf(testCase.length()));
    }

}
