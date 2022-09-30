package clases.Btw;

import java.io.Serializable;

import lombok.Data;

@Data
public  class CoOneTime  implements Serializable{
    private static final long serialVersionUID = 1L;
    private String company;
    private String identificationType;
    private String coOneTimeID;
    private String companyName;
    private String countryCode;
}
