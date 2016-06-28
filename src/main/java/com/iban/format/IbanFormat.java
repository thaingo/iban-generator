package com.iban.format;

/**
 * Created by antosha4e on 28.06.16.
 */
public class IbanFormat {
    public static final IbanFormat GERMANY1 = new IbanFormat("DE", 8, 10);
    public static final IbanFormat GERMANY = new IbanFormat("DE", "18n");
    public static final IbanFormat AUSTRIA = new IbanFormat("AT", 5, 11);
    public static final IbanFormat NETHERLANDS = new IbanFormat("NL", "4a,10n");

    private String countryCode;
    private String countryCodeNumber;
    private int bankCode;
    private int accountNumber;

    public IbanFormat() {}

    public IbanFormat(String countryCode, String bbanFormat) {
        this.countryCode = countryCode;
        this.countryCodeNumber = "" + (countryCode.codePointAt(0) - 55) + (countryCode.codePointAt(1) - 55);

        this.bankCode = bankCode;
        this.accountNumber = accountNumber;
    }

    public IbanFormat(String countryCode, int bankCode, int accountNumber) {
        this.countryCode = countryCode;
        this.countryCodeNumber = "" + (countryCode.codePointAt(0) - 55) + (countryCode.codePointAt(1) - 55);

        this.bankCode = bankCode;
        this.accountNumber = accountNumber;
    }

    public String generateIBAN() {
        return null;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public int getBankCode() {
        return bankCode;
    }

    public void setBankCode(int bankCode) {
        this.bankCode = bankCode;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCountryCodeNumber() {
        return countryCodeNumber;
    }

    public void setCountryCodeNumber(String countryCodeNumber) {
        this.countryCodeNumber = countryCodeNumber;
    }
}