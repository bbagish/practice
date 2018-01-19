//package com.automation.Methods;
//import java.util.Properties;
//import javax.activation.*;
//import javax.mail.*;
//import javax.mail.internet.*;
//
//public class EmailStatus {
//	public static void sentEmail(String toEmail, String fromEmail, String reportName) throws Throwable {
//		String host = "";
//		Properties properties = System.getProperties();
//		properties.setProperty("mail.smtp.host", host);
//		javax.mail.Session session = javax.mail.Session.getDefaultInstance(properties);
//
//		try {
//			MimeMessage message = new MimeMessage(session);
//			message.setFrom(new InternetAddress(fromEmail));
//			message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
//			message.setSubject(EmailConfig.subject);
//			
//			BodyPart body = new MimeBodyPart();
//			body.setContent(EmailConfig.messageBody, "text/html");
//			BodyPart attachment = new MimeBodyPart();
//			DataSource source = new FileDataSource(reportName);
//			attachment.setDataHandler(new DataHandler(source));
//			attachment.setFileName(EmailConfig.attachmentName);
//			MimeMultipart multipart = new MimeMultipart();
//			multipart.addBodyPart(body);
//			multipart.addBodyPart(attachment);
//			message.setContent(multipart);
//			// send the message
//			Transport.send(message);
//
//		} catch (MessagingException mex) {
//			mex.printStackTrace();
//
//		}
//	}
//}
