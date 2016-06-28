package com.iban.generator;

/**
 * Created: antosha4e
 * Date: 28.06.16
 */
public class GermanyGenerator implements Generator {
    private String COUNTRY_CODE = "DE";

    @Override
    public String generate() {
        return COUNTRY_CODE + 1;
    }
}

/*

DEkk bbbb bbbb cccc cccc cc
b = Bank and branch identifier (de:Bankleitzahl or BLZ)
c = Account number

 */