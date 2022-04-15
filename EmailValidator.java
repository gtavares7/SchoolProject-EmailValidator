import java.util.*;

public class EmailValidator {

    // check if characters in the email are alphanumeric
    public boolean isAlphanumeric(char c) {

        // check to see if a character is either a letter or digit
        if (Character.isDigit(c)) || Character.isLetter(c)) {
            return true;
        } else {
            return false;
        }
    }

    // check if email characters are valid prefix characters
    public boolean isValidPrefixChar(char c) {

        // check to see if a prefix character is alphanumeric or contains a dash, a period or an underscore
        if (isAlphanumeric(c) || c == '-' || c == '.' || c == '_') {
            return true;
        } else {
            return false;
        }
    }




}
