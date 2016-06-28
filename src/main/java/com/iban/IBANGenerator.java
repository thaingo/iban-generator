package com.iban;

import com.iban.format.IbanFormat;

import java.math.BigInteger;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created: antosha4e
 * Date: 28.06.16
 */
public final class IBANGenerator {
    private static Set<String> ibans = ConcurrentHashMap.newKeySet();

    public static String generateNext(IbanFormat format) {
        String iban = null;

        while(!ibans.add(iban = getNewNumber(format)));

        return iban;
    }

    private static String getNewNumber(IbanFormat format) {
        String base = new BigInteger(100, new Random()).toString();

        base = base.substring(0, format.getBankCode() + format.getAccountNumber());

        String code = format.getCountryCodeNumber();

        int checkSum = 98 - new BigInteger(base + code + "00").mod(new BigInteger("97")).intValue();

        return format.getCountryCode() + checkSum + base;
    }
}