package com.iban;

import com.iban.format.IbanFormat;
import org.testng.annotations.*;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import static org.testng.Assert.assertTrue;

public class IbanTest {

    private static Set<String> ibans = ConcurrentHashMap.newKeySet();

    @Test(threadPoolSize = 10, invocationCount = 2000,  timeOut = 10000)
    public void testConcurrencyGenerator() {
        assertTrue(ibans.add(IBANGenerator.generateNext(IbanFormat.NETHERLANDS)));
    }

    @Test
    public void testNewFormats() {
        IBANGenerator.generateNext(new IbanFormat("RU", "5a", "4n"));

        IBANGenerator.generateNext(new IbanFormat("US", "10n"));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testWrongFormat() {
        IBANGenerator.generateNext(new IbanFormat("DE"));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testWrongCode1() {
        IBANGenerator.generateNext(new IbanFormat("D", "10n"));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testWrongCode2() {
        IBANGenerator.generateNext(new IbanFormat("RUS", "1a"));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testWrongBBANlength() {
        IBANGenerator.generateNext(new IbanFormat("DE", "20n", "20n"));
    }
}
