package businessFramework.commonFunctions;

/**
 *
 * @author patil
 */

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
public class MailAuth extends Authenticator{
    public static final String SMTP_AUTH_USER = "hospitalmanagement.aed@gmail.com";                                 
    public static final String SMTP_AUTH_PWD  = "fvjzyugaljixuymi"; 
    
    @Override                                                                                                                   
    public PasswordAuthentication getPasswordAuthentication()                                             
    {                                                                                                                                      
        String username = SMTP_AUTH_USER;                                                                    
        String password = SMTP_AUTH_PWD;                                                                     
        return new PasswordAuthentication(username, password);                                             
    }  
    
}
