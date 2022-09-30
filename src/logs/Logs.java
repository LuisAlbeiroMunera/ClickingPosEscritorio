package logs;

import clases.Instancias;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

public class Logs {
	static Logger log = Logger.getLogger(Logs.class);
        
	public static void log(int tipoError, String mensaje) {
		
		String info = " ";
                
		try {
			StackTraceElement ste = Thread.currentThread().getStackTrace()[2];
			String className = ste.getClassName();
			if (className.contains("."))
				className = className.substring(className.lastIndexOf(".")+1);
			info = "["+ste.getMethodName()+"]";
                        log = Logger.getLogger(className);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
                
                switch(tipoError)
                {
                    
                    case Priority.ERROR_INT: 
                        log.error(info+" ["+mensaje+"]");
                        break;
                    case Priority.DEBUG_INT: 
                        log.debug(info+" ["+mensaje+"]");
                        break;
                    case Priority.FATAL_INT: 
                        log.fatal(info+" ["+mensaje+"]");
                        break;
                    case Priority.WARN_INT: 
                        log.warn(info+" ["+mensaje+"]");
                        break;
                     default :
                        log.info(info+" ["+mensaje+"]");
                        break;
                }               	          
	}
	
	public static void error(String mensaje) {
            log(Priority.ERROR_INT,mensaje);
	}
        
        public static void debug(String mensaje) {
            log(Priority.DEBUG_INT,mensaje);
	}
        
        public static void warn(String mensaje) {
            log(Priority.WARN_INT,mensaje);
	}
        
        public static void fatal(String mensaje) {
            log(Priority.FATAL_INT,mensaje);
	}
        
        public static void log(String mensaje) {
            log(Priority.INFO_INT,mensaje);
	}
	
	public static void error(Exception e) {
		try {
			String mensaje = e.getMessage() + " - " + e.getClass()+" - "+e.getCause();
	        int size = e.getStackTrace().length - 1;
	        mensaje += "- Root cause: method=" + e.getStackTrace()[0].getMethodName() + " class=" + e.getStackTrace()[0].getClassName()+" line="+e.getStackTrace()[0].getLineNumber();
	        if (size>1) { 
	        	mensaje += " - Penultimate cause: method=" + e.getStackTrace()[1].getMethodName() + " class=" + e.getStackTrace()[1].getClassName() + " line=" + e.getStackTrace()[1].getLineNumber(); 
	        }
			log(Priority.FATAL_INT,mensaje);
		}
		catch(Exception e2) {
			e.printStackTrace();
		}
	}
}