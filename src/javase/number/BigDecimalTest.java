package javase.number;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        //高精度
        BigDecimal v1 = new BigDecimal(100);
        BigDecimal v2 = new BigDecimal(100);

        BigDecimal v3 = v1.add(v2);
        System.out.println(v3);

    }
}
