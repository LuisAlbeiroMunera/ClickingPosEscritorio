package clases.Btw;

import java.io.Serializable;

import lombok.Data;

@Data
public  class InvcDisc  implements Serializable{

    private static final long serialVersionUID = 1L;
    private String company;
    private String invoiceNum;
    private String discCode;
    private String description;
    private double discBaseAmount;
    private double discAmt;
    private double docDiscAmt;
    private String discCodeDescription;
    private double percentage;
}
