
package clases;

import java.util.List;

/**
 *
 * @author amgon
 */
public class RespuestaServicioPreFactura extends RespuestaServicioFactura{
    private List<PrefacturaPTM> dato;

    public List<PrefacturaPTM> getDato() {
        return dato;
    }

    public void setDato(List<PrefacturaPTM> dato) {
        this.dato = dato;
    }    
}
