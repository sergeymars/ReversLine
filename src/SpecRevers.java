
import java.util.ArrayList;
import java.util.List;

public class SpecRevers {

    public   String getReversOnlyLetters(String origin) {
        List<Number> boxOfNumber = new ArrayList<>();
        StringBuilder forReturnStr = new StringBuilder();
        int index = 0;
        for (char oneChar : origin.toLowerCase().toCharArray()) {
            if (Character.isLetter(oneChar))
                forReturnStr.append(oneChar);
            else boxOfNumber.add(new Number(oneChar, index));
            index++;
        }
        forReturnStr.reverse();
        for (Number  number : boxOfNumber)
            forReturnStr.insert(number.indexOfValue , number.value);
        return forReturnStr.toString();
    }


    static class Number {
        final char value;
        final int indexOfValue;

        Number(char value, int indexOfNumber) {
            this.value  = value;
            this.indexOfValue = indexOfNumber;
        }


    }


}