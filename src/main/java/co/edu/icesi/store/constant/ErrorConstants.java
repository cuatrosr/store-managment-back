package co.edu.icesi.store.constant;

import lombok.Getter;

@Getter
public enum ErrorConstants {

    CODE_UD_01("EMAIL OR PHONE NUMBER IS REQUIRED"),
    CODE_UD_02("EMAIL DOMAIN IS NOT VALID"),
    CODE_UD_03("EMAIL CANNOT HAVE SPECIAL CHARACTERS"),
    CODE_UD_04("PHONE EXTENSION IS NOT VALID"),
    CODE_UD_05("PHONE NUMBER CANNOT HAVE SPACES"),
    CODE_UD_06("PHONE NUMBER IS NOT VALID"),
    CODE_UD_07("FIRST AND LAST NAME CANNOT BE MORE THAN 120 CHARACTERS"),
    CODE_UD_08("FIRST AND LAST NAME CANNOT HAVE SPECIAL CHARACTERS"),
    CODE_UD_09("EMAIL OR PHONE ARE ALREADY USED"),
    CODE_UD_10("MUST BE AUTHENTICATED TO DO THIS REQUEST"),
    CODE_UD_11("PASSWORD NEED TO CONTAIN AT LEST ONE UPPERCASE, LOWERCASE LETTER, A NUMBER AND A SYMBOL LIKE #$%@"),
    CODE_UD_12("YOU ARE NOT AUTHORIZED TO DO THIS REQUEST");

    private final String message;

    ErrorConstants(String message) {
        this.message = message;
    }
}