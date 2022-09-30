package clases.PTM;

import co.com.tecnofactor.ptfcc.services.ServiciosPTMWS.ServiciosPTMWSLocator;
import co.com.tecnofactor.ptfcc.services.ServiciosPTMWS.ServiciosPTMWSPortType;
import configuracion.Propiedades;
import logs.Logs;

public class PruebaPTM {

    private ServiciosPTMWSPortType soap = null;

    public static void main(String args[]) {
        new PruebaPTM();
    }

    public ServiciosPTMWSPortType getService() {
        if (soap == null) {
            ServiciosPTMWSLocator locator = new ServiciosPTMWSLocator(Propiedades.getInstancia().getUrlPTM());
            try {
                soap = locator.getServiciosPTMWSHttpSoap11Endpoint();
                org.apache.axis.client.Stub axisPort = (org.apache.axis.client.Stub) soap;
                axisPort.setTimeout(Propiedades.getInstancia().getTimeoutPTM());
                axisPort._setProperty("axis.connection.timeout", Propiedades.getInstancia().getTimeoutPTM());
                axisPort._setProperty(org.apache.axis.client.Call.CONNECTION_TIMEOUT_PROPERTY, Propiedades.getInstancia().getTimeoutPTM());
                axisPort._setProperty(org.apache.axis.components.net.DefaultCommonsHTTPClientProperties.CONNECTION_DEFAULT_CONNECTION_TIMEOUT_KEY, Propiedades.getInstancia().getTimeoutPTM());
                axisPort._setProperty(org.apache.axis.components.net.DefaultCommonsHTTPClientProperties.CONNECTION_DEFAULT_SO_TIMEOUT_KEY, Propiedades.getInstancia().getTimeoutPTM());
            } catch (Exception e) {
                Logs.error(e);
            }
        }
        return soap;
    }
}
