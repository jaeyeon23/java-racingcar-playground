package calc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalcAddValidation {
    private static final Pattern CUSTOM_DELIMETER = Pattern.compile("//(.)\n(.*)");
    private static final String SEPERATE = ",|:";

    public String[] refineNumber(String text) {
        Matcher m = CUSTOM_DELIMETER.matcher(text);
        if (m.find()) {
            return customDelimeterResult(m);
        }
        return text.split(SEPERATE);
    }

    public String[] customDelimeterResult(Matcher m) {
        String customDelimeter = m.group(CalcNumber.CHECK_CUSTOM_DELIMETER);
        return m.group(CalcNumber.CUSTOM_DELETER_INDEX).split(customDelimeter);
    }
}
