package hdu;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class test_mail {

	 public static void main(String[] args) throws Exception {  
	        Properties props = new Properties();  
	        props.setProperty("mail.smtp.auth", "true");  
	        props.setProperty("mail.transport.protocol", "smtp");  
	          
	        Session session = Session.getInstance(props);  
	        session.setDebug(true);  
	          
	        Message msg = new MimeMessage(session);  
	        msg.setSubject("这是一个测试程序....");  
	        msg.setText("你好!这是我的第一个javamail程序---king");  
	        msg.setFrom(new InternetAddress("jyk0406@126.com"));  
	  
	        Transport transport = session.getTransport();  
	        transport.connect("smtp.126.com", 25, "jyk0406", "jyk199346");  
	        transport.sendMessage(msg,new Address[]{new InternetAddress("461882131@qq.com")});  
	  
	        System.out.println("邮件发送成功...");  
	        transport.close();  
	    }  

}
