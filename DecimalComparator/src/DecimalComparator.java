import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double x, double y) {

        BigDecimal xx = BigDecimal.valueOf(x);
        BigDecimal yy = BigDecimal.valueOf(y);

        xx = xx.setScale(3, RoundingMode.DOWN);
        yy = yy.setScale(3, RoundingMode.DOWN);

        return xx.equals(yy);
    }
}
