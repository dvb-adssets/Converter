package converter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Baronen
 */
import java.math.BigDecimal;
import javax.ejb.Remote;


@Remote // Lets the container know that ConverterBean will be accessed by remote clients.
public interface Converter {
    public BigDecimal dollarToYen(BigDecimal dollars);
    public BigDecimal yenToEuro(BigDecimal yen);
}
