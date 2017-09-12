package com.iban;

import com.iban.format.IbanFormat;
import com.iban.utils.IbanUtils;

import java.math.BigInteger;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class IBANGenerator {

    private static Set<String> ibans = ConcurrentHashMap.newKeySet();

    public static String generateNext(IbanFormat format) {

        String iban = null;

        while(!ibans.add(iban = getNewNumber(format)));

        return iban;
    }

    private static String getNewNumber(IbanFormat format) {

        StringBuilder iban = new StringBuilder();

        for(IbanFormat.BbanFormat bbanFormat: format.getFormatList()) {
            if(bbanFormat.isAlpha()) {
                iban.append(IbanUtils.getRandomString(bbanFormat.getLength()));
            } else {
                iban.append(IbanUtils.getRandomNumber(bbanFormat.getLength()));
            }
        }

        int checkSum = 98 - new BigInteger(IbanUtils.toNumberString(iban + format.getCountryCode()) + "00").mod(new BigInteger("97")).intValue();

        return format.getCountryCode() + (checkSum < 10 ? "0" + checkSum : checkSum) + iban;
    }
}
