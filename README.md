# README #

### What is this repository for? ###

Pseudo IBAN ([International Bank Account Number](https://en.wikipedia.org/wiki/International_Bank_Account_Number)) generator

### How can I use it? ###

After you add library to your project, you can use it as follows:

``` java

IBANGenerator.generateNext(IbanFormat.NETHERLANDS);

```

Or even with your own format:

``` java

IBANGenerator.generateNext(new IbanFormat("RU", "20n"));

```

Library is thread-safe, you can use it in multithreaded environment