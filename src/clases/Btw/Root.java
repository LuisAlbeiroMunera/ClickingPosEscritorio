package clases.Btw;
import java.io.Serializable;
import java.util.ArrayList;

import lombok.Data;

@Data
public class Root  implements Serializable{
    private static final long serialVersionUID = 1L;
    private InvcHead invcHead;
    private ArrayList<InvcDtl> invcDtl;
    private ArrayList<InvcTax> invcTax;
    private ArrayList<InvcMisc> invcMisc;
    private Company company;
    private Customer customer;
    private ArrayList<SalesTRC> salesTRC;
    private CoOneTime coOneTime;
    private ArrayList<PrepaidPayment> prepaidPayment;
    private ArrayList<InvcDisc> invcDisc;
    private ArrayList<AdditionalTag> additionalTags;
    private ArrayList<AdditionalCustomer> additionalCustomer;
    private ArrayList<AdditionalField> additionalField;
}
