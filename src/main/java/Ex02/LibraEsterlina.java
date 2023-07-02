package Ex02;
import java.math.BigDecimal;

public class LibraEsterlina implements Moeda{

    //MÉTODO
    public BigDecimal converterParaReal(BigDecimal valorParaConverter) {
        return valorParaConverter.multiply(BigDecimal.valueOf(7.5));
    }
}
