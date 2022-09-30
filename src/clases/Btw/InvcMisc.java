package clases.Btw;

import java.io.Serializable;

import lombok.Data;

@Data
public  class InvcMisc implements Serializable{
    private static final long serialVersionUID = 1L;
    private String company;
    private String invoiceNum;
    private double invoiceLine;
    private String miscCode;
    private String description;
    private double miscAmt;
    private double docMiscAmt;
    private String miscCodeDescription;
    private double percentage;
    private double miscBaseAmt;
}
