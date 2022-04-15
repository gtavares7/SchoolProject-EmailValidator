import java.util.*;

public class EmailValidator {

    // check if the characters in the email are alphanumeric
    public boolean isAlphanumeric(char c) {

        // Check to see if a character is either a letter or a digit
        if (Character.isDigit(c) || Character.isLetter(c)) {
            return true;
        } else {
            return false;
        }
    }

    // check if email characters are valid prefix characters
    public boolean isValidPrefixChar(char c) {

        // check if prefix characters are alphanumeric or contains a dash, a period or an underscore
        if (isAlphanumeric(c) || c == '-' || c == '.' || c == '_') {
            return true;
        } else {
            return false;
        }
    }

    // check if the email domain contains only valid characters
    public boolean isValidDomainChar(char c) {

        //check if domain characters are alphanumeric or contains a dash or a period
        if (isAlphanumeric(c) || c == '-' || c == '.') {
            return true;
        } else {
            return false;
        }
    }

    // check if email contains only one "@" symbol
    public boolean exactlyOneAt(String email) {

        int oneAt = 0;

        // loop over email to check for an "@"
        for (int i = 0; i < email.length(); i++) {
            // if an "@" is found...
            if (email.charAt(i) == '@') {
                // ... increment the count by 1
                oneAt =+ 1;
            }
        }
        return oneAt == 1;
    }

    // method to get email prefix
    public static String getPrefix(String email) {

        // split email at the "@"
        String[] emailSplit = email.split("@");
        // return the prefix before the "@"
        return emailSplit[0];
    }

    // method to get email domain
    public static String getDomain(String email) {

        String[] emailSplit = email.split("@");
        // return the domains after the "@"
        return emailSplit[1];
    }


}
