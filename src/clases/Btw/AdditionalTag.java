package clases.Btw;

import java.io.Serializable;

import lombok.Data;

@Data
public class AdditionalTag  implements Serializable{
    private static final long serialVersionUID = 1L;
    private String company;
    private String invoiceNum;
    private String nodoPersonalizado;
    private String nombreSector;
    private String url;
    private String urlArgumentoName1;
    private String urlArgumentoValue1;
    private String urlArgumentoName2;
    private String urlArgumentoValue2;
    private String urlArgumentoName3;
    private String urlArgumentoValue3;
    private String urlArgumentoName4;
    private String urlArgumentoValue4;
    private String ws;
    private String wsArgumentoName1;
    private String wsArgumentoValue1;
    private String wsArgumentoName2;
    private String wsArgumentoValue2;
    private String wsArgumentoName3;
    private String wsArgumentoValue3;
    private String wsArgumentoName4;
    private String wsArgumentoValue4;
}
