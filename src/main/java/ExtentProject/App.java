package ExtentProject;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

public class App 
{
    public static void main( String[] args )
    {
    	final String fromEmail = "juanmspoleti@gmail.com"; //requires valid gmail id
    	final String password = "ACA VA TU CONTRASEÑA POLEEE";
    	final String toEmail = "UN.MAIL.VALIDO@gmail.com";//"";
    	System.out.println("TLSEmail Start");
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
		props.put("mail.smtp.port", "587"); //TLS Port
		props.put("mail.smtp.auth", "true"); //enable authentication
		props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS
		
		//create Authenticator object to pass in Session.getInstance argument
				Authenticator auth = new Authenticator() {
					//override the getPasswordAuthentication method
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(fromEmail, password);
					}
				};
				Session session = Session.getInstance(props, auth);

		EmailUtil.sendEmail(session, toEmail,"Pole puto come traba", "trolazo cara de verga... aca tenes tu mail hdp!!");
    	//smtp.gmail.com
        System.out.println( "Hello World!" );
    }
}
