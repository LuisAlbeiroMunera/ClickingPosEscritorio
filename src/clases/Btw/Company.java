package clases.Btw;

import java.io.Serializable;

import lombok.Data;

@Data
public class Company  implements Serializable{

    private static final long serialVersionUID = 1L;
    private String company;
    private String stateTaxID;
    private String name;
    private String regimeType_c;
    private String fiscalResposability_c;
    private String operationType_c;
    private String attrOperationType_c;
    private double companyType_c;
    private String state;
    private String stateNum;
    private String city;
    private String cityNum;
    private String industryClassificationCode_c;
    private String identificationType;
    private String address1;
    private String country;
    private String orderNum;
    private String postalZone_c;
    private String phoneNum;
    private String faxNum;
    private String email;
    private String webPage;
    private String companyOrigin;
    private boolean shareholder;
    private double participationPercent;
}
