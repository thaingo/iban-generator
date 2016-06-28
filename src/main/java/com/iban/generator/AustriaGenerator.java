package com.iban.generator;

/**
 * Created: antosha4e
 * Date: 28.06.16
 */
public class AustriaGenerator implements Generator {
    private String COUNTRY_CODE = "AT";

    @Override
    public String generate() {
        return COUNTRY_CODE + 1;
    }
}

/*

ATkk bbbb bccc cccc cccc
b = National bank code
c = Account number

 */