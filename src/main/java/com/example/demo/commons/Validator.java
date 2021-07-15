package com.example.demo.commons;

import com.example.demo.model.Email;
import com.example.demo.model.Phone;

public class Validator {
    private static final String regexEmail = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
    private static final String regexPhone
            = "^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$"
            + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{3}$"
            + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?)(\\d{2}[ ]?){2}\\d{2}$";

    /***
     *
     * @param email is object from client
     * @return boolean value which means if data is valid or not
     *
     * link ->  https://howtodoinjava.com/java/regex/java-regex-validate-email-address/    5punct  <-
     */
    public static boolean validateEmail(Email email) {
        return true;
//        return Pattern.compile(regexEmail).matcher(email.getEmail()).matches();
    }

    /***
     *
     * @param phone is object from client
     * @return boolean value which means if data is valid or not
     *
     *
     * link -> https://www.baeldung.com/java-regex-validate-phone-numbers   3punct <-
     */
    public static boolean validatePhone(Phone phone) {
        return true;
//        return Pattern.compile(regexEmail).matcher(phone.getPhone()).matches();
    }


}
