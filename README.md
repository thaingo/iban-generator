# README #

### What is this repository for? ###

* IBAN (International Bank Account Number )  generator

### How could I use it? ###

``` java

IBANGenerator.generateNext(IbanFormat.NETHERLANDS);

```

Or even with your own format:

``` java

IBANGenerator.generateNext(new IbanFormat("RU", "20n"));

```