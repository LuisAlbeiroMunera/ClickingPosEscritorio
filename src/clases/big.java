package clases;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;

public class big {

    Instancias instancias = Instancias.getInstancias();

    public static BigDecimal getBigDecimal(Object value) {
        Locale.setDefault(new Locale("es", "CO"));
        BigDecimal ret = null;
        if (value != null) {
            if (value instanceof BigDecimal) {
                ret = (BigDecimal) value;
            } else if (value instanceof String) {
                ret = new BigDecimal((String) value);
            } else if (value instanceof BigInteger) {
                ret = new BigDecimal((BigInteger) value);
            } else if (value instanceof Number) {
                ret = new BigDecimal(((Number) value).doubleValue());
            } else {
                throw new ClassCastException("Not possible to coerce [" + value + "] from class " + value.getClass() + " into a BigDecimal.");
            }
        }
        return ret;
    }
    

    public static String setMoneda(BigDecimal num) {
        Locale.setDefault(new Locale("es", "CO"));
        String cadenaDecimales = Instancias.getInstancias().getCadenaDecimales();
        String simbolo = Instancias.getInstancias().getSimbolo();

        DecimalFormat formato = new DecimalFormat(simbolo + " ###,###." + cadenaDecimales);
        return formato.format(num);

    }
    
//    public static String setMoneda(BigDecimal num) {
//        Locale.setDefault(new Locale("es", "CO"));
//        String cadenaDecimales = Instancias.getInstancias().getCadenaDecimales();
//        String simbolo = Instancias.getInstancias().getSimbolo();
//
//        DecimalFormat formato = new DecimalFormat(simbolo + " ###,###.##");
//        return formato.format(num);
//
//    }
    
    public static String setMoneda(double num) {
        return setMoneda(new BigDecimal(num)) ;
    }

    public static String setMonedaSinDecimales(BigDecimal num) {
        Locale.setDefault(new Locale("es", "CO"));
        String simbolo = Instancias.getInstancias().getSimbolo();
        DecimalFormat formato = new DecimalFormat(simbolo + " ###,###");
        return formato.format(num);
    }
    
    public static String setMonedaExacta(BigDecimal num) {
        Locale.setDefault(new Locale("es", "CO"));
        String simbolo = Instancias.getInstancias().getSimbolo();
        DecimalFormat formato = new DecimalFormat(simbolo + " ###,###.##");
        return formato.format(num);
    }
    
    public static String setMonedaExacta(double num) {    
        return setMonedaExacta(new BigDecimal(num));
    }

    public static String setNumero(BigDecimal num) {
        Locale.setDefault(new Locale("es", "CO"));
        String cadenaDecimales = Instancias.getInstancias().getCadenaDecimales();

        DecimalFormat formato = new DecimalFormat("###,###." + cadenaDecimales);
        return formato.format(num);
    }
    
    public static String setNumero(double num) { 
        return setNumero(getBigDecimal(num));
    }
    
    public static String setNumero(String num) { 
        return setNumero(getBigDecimal(num));
    }
    
    public static BigDecimal getMoneda(String num) {
        Locale.setDefault(new Locale("es", "CO"));
        String simbolo = Instancias.getInstancias().getSimbolo();

        int pos = num.length();
        if (Character.toString(num.charAt(pos - 1)).equals(",")) {
            return getBigDecimal(((num.replace(simbolo + " ", "")).replace(".", "")));
        }
        return getBigDecimal(((num.replace(simbolo + " ", "")).replace(".", "")).replace(",", "."));
    }
    
   
    public static double getMonedaToDouble(String num) {
        Locale.setDefault(new Locale("es", "CO"));
        String simbolo = Instancias.getInstancias().getSimbolo();

        int pos = num.length();
        if (Character.toString(num.charAt(pos - 1)).equals(",")) {
            return formatDouble(getBigDecimal(((num.replace(simbolo + " ", "")).replace(".", ""))));
        }
        return formatDouble(getBigDecimal(((num.replace(simbolo + " ", "")).replace(".", "")).replace(",", ".")));
        
    }
   
    
    public static double formatDouble(BigDecimal numero){  
        try {
             return truncNoRound(numero.movePointRight(20).round(MathContext.UNLIMITED).movePointLeft(20).setScale(20, RoundingMode.DOWN).doubleValue(),2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0.0;
    }
    
     public static double formatDouble(Double numero){  
        try {
             return truncNoRound(getBigDecimal(numero).movePointRight(20).round(MathContext.UNLIMITED).movePointLeft(20).setScale(20, RoundingMode.DOWN).doubleValue(),2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0.0;
    }
     
     public static double formatDouble(String numero){  
        try {
             return truncNoRound(getBigDecimal(numero).movePointRight(20).round(MathContext.UNLIMITED).movePointLeft(20).setScale(20, RoundingMode.DOWN).doubleValue(),2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0.0;
    }
     
     
    public static double truncateDecimal(double x,int numberofDecimals){
        if ( x > 0) {
            return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_FLOOR).doubleValue();
        } else {
            return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_CEILING).doubleValue();
        }
    }
    
    public static double truncNoRound(double num1,int decimales){
        //BigDecimal big1 = truncateDecimal2(num1, decimales);
        return redondearDecimales(num1, decimales);
    }
     
    public static double sumaExacta(double num1, double num2){     
        BigDecimal big1 = truncateDecimal2(num1, 2);
        BigDecimal big2 = truncateDecimal2(num2, 2);
        double suma = redondearDecimales((big1.doubleValue()+big2.doubleValue()),2);
        return suma;
    } 
    
    public static BigDecimal truncateDecimal2(double x,int numberofDecimals){
       if ( x > 0) {
           return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_FLOOR);
       } else {
           return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_CEILING);
       }
    }

    public static double redondearDecimales(double valorInicial, int numeroDecimales) {
        double parteEntera, resultado;
        resultado = valorInicial;
        parteEntera = Math.floor(resultado);
        resultado=(resultado-parteEntera)*Math.pow(10, numeroDecimales);
        resultado=Math.round(resultado);
        resultado=(resultado/Math.pow(10, numeroDecimales))+parteEntera;
        return resultado;
   }

}
