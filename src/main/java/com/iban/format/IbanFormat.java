package com.iban.format;

import java.util.ArrayList;
import java.util.List;

import static com.iban.utils.IbanUtils.tryParseInt;

/**
 * Created by antosha4e on 28.06.16.
 */
public class IbanFormat {
    private static final int MAX_LENGTH = 30;

    public static final IbanFormat GERMANY = new IbanFormat("DE", "18n");
    public static final IbanFormat AUSTRIA = new IbanFormat("AT", "16n");
    public static final IbanFormat NETHERLANDS = new IbanFormat("NL", "4a", "10n");

    private String countryCode;
    private List<BbanFormat> formatList = new ArrayList<>();

    public IbanFormat() {}

    public IbanFormat(String countryCode, String... bbanFormatGroup) {
        if(countryCode == null || countryCode.length() < 2) {
            throw new IllegalArgumentException("Wrong country code");
        }

        if (bbanFormatGroup == null || bbanFormatGroup.length == 0) {
            throw new IllegalArgumentException("No BBAN format provided");
        }

        this.countryCode = countryCode;
        int length = 0;

        for (String format : bbanFormatGroup) {
            int len = tryParseInt(format.substring(0, format.length() - 1), 0);

            if (len < 1) {
                throw new IllegalArgumentException("Wrong format");
            }

            length += len;

            // for simplicity
            // later can extend to use all types : 'a', 'n', 'c'
            boolean alpha = format.endsWith("a");

            formatList.add(new BbanFormat(len, alpha));
        }

        if (length > MAX_LENGTH) {
            throw new IllegalArgumentException("BBAN length is too long");
        }
    }

    public List<BbanFormat> getFormatList() {
        return formatList;
    }

    public void setFormatList(List<BbanFormat> formatList) {
        this.formatList = formatList;
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

    public static class BbanFormat {
        private int length;
        private boolean alpha;

        public BbanFormat(int length, boolean alpha) {
            this.length = length;
            this.alpha = alpha;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public boolean isAlpha() {
            return alpha;
        }

        public void setAlpha(boolean alpha) {
            this.alpha = alpha;
        }
    }
}