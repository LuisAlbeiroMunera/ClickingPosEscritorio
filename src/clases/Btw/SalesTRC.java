package clases.Btw;

import java.io.Serializable;

import lombok.Data;

@Data
public  class SalesTRC  implements Serializable{

    private static final long serialVersionUID = 1L;
    private String company;
    private String rateCode;
    private String taxCode;
    private String description;
    private String idImpDIAN_c;
    private String totalValueTaxRenta;
}
