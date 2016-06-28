# README #

### What is this repository for? ###

IBAN (International Bank Account Number )  generator

### How can I use it? ###

After you add library to your project, you can use it as follows:

``` java

IBANGenerator.generateNext(IbanFormat.NETHERLANDS);

```

Or even with your own format:

``` java

IBANGenerator.generateNext(new IbanFormat("RU", "20n"));

```