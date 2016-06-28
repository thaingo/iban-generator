import com.iban.IBANGenerator;
import com.iban.format.IbanFormat;

/**
 * Created by antosha4e on 28.06.16.
 */
public class Main1 {
    public static void main(String[] args) {
//        System.out.println(new BigInteger(100, new Random()));
//        System.out.println(new BigInteger("2").pow(100));
//        System.out.println(Integer.MAX_VALUE);

        System.out.println(IBANGenerator.generateNext(IbanFormat.NETHERLANDS));
    }
}