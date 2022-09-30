package clases.Btw;
import java.io.Serializable;
import lombok.Data;


@Data
public class AdditionalCustomer implements Serializable{
    private static final long serialVersionUID = 1L;
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
    private String authorizationNumber;
    private String policyNumber;
    private double moderatingFeeAmt;
    private double coPaymentAmt;
    private double retrievalFeeAmt;
    private double sharedPaytmentAmt;
    private String serviceProviderCode;
    private String mipresNumber;
    private String mipresid;
    private String contractNumber;
}
