package clases.Btw;

import java.io.Serializable;

import lombok.Data;

@Data
public  class PrepaidPayment  implements Serializable{

    private static final long serialVersionUID = 1L;
    private String prepaidPaymentID_c;
    private String paidDate;
    private String paidTime;
    private double paidAmount;
    private String instructionPrepaidPayment_c;
}
