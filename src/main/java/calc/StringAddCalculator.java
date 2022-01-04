package calc;

import java.util.regex.Pattern;

public class StringAddCalculator {
    private static final Pattern NUMBER_RANGE = Pattern.compile("^[0-9]+$");

    public int splitAndSum(String text) {
        if (isTextEmptyOrNull(text)) {
            return CalcNumber.ZERO;
        }
        CalcAddValidation calcAddValidation = new CalcAddValidation();
        return getResultSum(calcAddValidation.refineNumber(text));
    }

    private int getResultSum(String[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            checkMinusNumber(numbers[i]);
            result += Integer.parseInt(numbers[i]);
        }
        return result;
    }

    private void checkMinusNumber(String number) {
        if (!NUMBER_RANGE.matcher(number).find()) {
            throw new RuntimeException();
        }
    }

    private boolean isTextEmptyOrNull(String text) {
        return text == null || text.isEmpty();
    }
}
