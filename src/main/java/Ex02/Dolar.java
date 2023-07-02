package Ex02;
import java.math.BigDecimal;

public class Dolar implements Moeda{

    //MÉTODO
    public BigDecimal converterParaReal(BigDecimal valorParaConverter) {

        return valorParaConverter.multiply(BigDecimal.valueOf(5.25));
    }
}
