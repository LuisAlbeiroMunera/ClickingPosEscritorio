package clases.Btw;

import java.io.Serializable;

import lombok.Data;

@Data
public  class Customer  implements Serializable{

    private static final long serialVersionUID = 1L;
    private String company;
    private String custID;
    private String custNum;
    private String resaleID;
    private String name;
    private String address1;
    private String eMailAddress;
    private String phoneNum;
    private String currencyCode;
    private String address2;
    private String address3;
    private String country;
    private String codPostal;
    private String faxNum;
    private String patientName;
    private String patientFamilyName1;
    private String patientFamilyName2;
    private String patientFirstName;
    private String patientFirstName2;
    private String idPatient;
    private String tipoDocPatient;
    private String patientAddress;
    private String patientCity;
    private String patientCityNum;
    private String patientEmail;
    private String patientCountry;
    private String patientNumHistory;
    private String patientPhoneNum;
    private String patientBirthday;
    private String patientAge;
    private String patientRegime;
    private String patientPaymentMode;
    private String patientCoverage;
    private String admissionDate;
    private String dischargeDate;
    private String shipToName;
    private String shipToId;
    private String shipToAddress;
    private String shipToPhoneNum;
    private String shipToEmail;
    private double contactsNumber;
    private String shipToPhone;
    private String shipToCity;
    private String territoryTerritoryDesc;
    private String termsDescription;
    private String regimeType_c;
    private String fiscalResposability_c;
    private String state;
    private String stateNum;
    private String city;
    private String cityNum;
}
