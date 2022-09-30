package clases.Btw;

import java.io.Serializable;

import lombok.Data;

@Data
public class AdditionalField  implements Serializable{
    private static final long serialVersionUID = 1L;
    private String company;
    private String table;
    private String field;
    private String value;
}
