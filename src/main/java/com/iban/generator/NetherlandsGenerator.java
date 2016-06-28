package com.iban.generator;

/**
 * Created: antosha4e
 * Date: 28.06.16
 */
public class NetherlandsGenerator implements Generator {
    private String COUNTRY_CODE = "NL";

    @Override
    public String generate() {
        return COUNTRY_CODE + 1;
    }
}

/*

NLkk bbbb cccc cccc cc
b = BIC Bank code
c = Account number

 */