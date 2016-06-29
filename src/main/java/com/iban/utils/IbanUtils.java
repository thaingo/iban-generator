package com.iban.utils;

import java.math.BigInteger;
import java.util.Random;

/**
 * Created: antosha4e
 * Date: 28.06.16
 */
public class IbanUtils {
    public static int tryParseInt(String iStr) {
        return tryParseInt(iStr, -1);
    }

    public static int tryParseInt(String iStr, int def) {
        if (iStr == null || iStr.length() == 0) {
            return def;
        }

        try {
            return Integer.parseInt(iStr, 10);
        } catch (NumberFormatException e) {
            return def;
        }
    }

    public static String getRandomNumber(int length) {
        String base = new BigInteger("10").pow(length).add(new BigInteger(100, new Random())).toString();

        return base.substring(0, length);
    }

    public static String getRandomString(int length) {
        char[] array = new char[length];
        Random rnd = new Random();

        // 65 - 90
        for(int i = 0; i < length; i++) {
            array[i] = (char)(65 + rnd.nextInt(25));
        }

        return new String(array);
    }

    public static String toNumberString(String str) {
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(Character.isDigit(ch)) {
                builder.append(ch);
            } else {
                builder.append(ch - 55);
            }
        }

        return builder.toString();
    }
}