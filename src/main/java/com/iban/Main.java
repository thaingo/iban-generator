package com.iban;

import java.math.BigInteger;
import java.util.Random;

/**
 * Created: antosha4e
 * Date: 28.06.16
 */
public class Main {
    public static void main(String[] args) {
        String code = "DE";

        int checkSum = 99;

        int rnd1 = 1000 + new Random().nextInt(8999);
        int rnd2 = 1000 + new Random().nextInt(8999);
        int rnd3 = 1000 + new Random().nextInt(8999);
        int rnd4 = 1000 + new Random().nextInt(8999);
        int rnd5 = 10 + new Random().nextInt(89);

        checkSum = 98 - new BigInteger("" + rnd1 + rnd2 + rnd3 + rnd4 + rnd5 + 13 + 14 + "00").mod(new BigInteger("97")).intValue();

        System.out.println(String.format("%s%02d %d %d %d %d %d", code, checkSum, rnd1, rnd2, rnd3, rnd4, rnd5));



//        String a = "DE44 5001 0517 5407 3249 31";
//
//        System.out.println('Z' - 55);
//
//        System.out.println(new BigInteger("500105175407324931131400").mod(new BigInteger("97")));
    }
}

/*


DEkk bbbb bbbb cccc cccc cc
b = Bank and branch identifier (de:Bankleitzahl or BLZ)
c = Account number


result - DE44 5001 0517 5407 3249 31

5001 0517 5407 3249 31  DE00

500105175407324931131400



 */