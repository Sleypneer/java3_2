import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger client_balance = BigInteger.valueOf(100L);
        BigInteger transfer = BigInteger.valueOf(1100L);
        BigInteger score = BigInteger.valueOf(1000);
        BigInteger value = BigInteger.valueOf(100);
        BigInteger balance;

        if (transfer.compareTo(score) == 1) {
            BigInteger bonus = transfer.divide(value);
             balance = client_balance.add(transfer.add(bonus));
        }
        else {
            balance = client_balance.add(transfer);
        }

        System.out.println(balance);
    }
}
