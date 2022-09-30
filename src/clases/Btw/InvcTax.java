package clases.Btw;

import java.io.Serializable;

import lombok.Data;

@Data
public  class InvcTax  implements Serializable{

    private static final long serialVersionUID = 1L;
    private String company;
    private String invoiceNum;
    private double invoiceLine;
    private String currencyCode;
    private String rateCode;
    private double docTaxableAmt;
    private double taxAmt;
    private double docTaxAmt;
    private double percent;
    private boolean withholdingTax_c;
    private double baseUnitMeasure_c;
    private double perUnitAmount_c;
}
