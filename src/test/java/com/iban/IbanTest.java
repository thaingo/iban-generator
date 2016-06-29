package com.iban;

import com.iban.format.IbanFormat;
import org.testng.annotations.*;

/**
 * Created: antosha4e
 * Date: 29.06.16
 */
public class IbanTest {
//    @Test(threadPoolSize = 10, invocationCount = 200,  timeOut = 10000)
    public void testConcurrencyGenerator() {
        IBANGenerator.generateNext(IbanFormat.NETHERLANDS);
        IBANGenerator.generateNext(IbanFormat.GERMANY);
        IBANGenerator.generateNext(IbanFormat.AUSTRIA);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testWrongFormat() {
        IBANGenerator.generateNext(new IbanFormat("DE"));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testWrongCode() {
        IBANGenerator.generateNext(new IbanFormat("1"));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testWrongBBANlength() {
        IBANGenerator.generateNext(new IbanFormat("DE", "20n", "20n"));
    }
}