package Ex02;
import java.math.BigDecimal;

public class Euro implements Moeda{

    //MÉTODO
    public BigDecimal converterParaReal(BigDecimal valorParaConverter) {
        return valorParaConverter.multiply(BigDecimal.valueOf(6.15));
    }
}
