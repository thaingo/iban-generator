import com.iban.IBANGenerator;
import com.iban.format.IbanFormat;
import com.iban.utils.IbanUtils;

/**
 * Created by antosha4e on 28.06.16.
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(IBANGenerator.generateNext(IbanFormat.NETHERLANDS));
        System.out.println(IBANGenerator.generateNext(IbanFormat.GERMANY));
        System.out.println(IBANGenerator.generateNext(IbanFormat.AUSTRIA));
    }
}