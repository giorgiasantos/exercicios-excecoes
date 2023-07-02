package Ex02;
import java.math.BigDecimal;

public class DolarCanadense implements Moeda{

    //MÉTODO
    public BigDecimal converterParaReal(BigDecimal valorParaConverter) {
        return valorParaConverter.multiply(BigDecimal.valueOf(4.15));
    }
}
