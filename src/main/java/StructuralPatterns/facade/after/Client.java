package StructuralPatterns.facade.after;

import org.springframework.mail.MailMessage;

public class Client {

    public static void main(String[] args) {


        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");
        EmailSender emailSender = new EmailSender(emailSettings);
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("JHY");
        emailMessage.setTo("whiteship");
        emailMessage.setSubject("오징어 게임");
        emailMessage.setText("빡은 더 지옥이더라고....");
        emailSender.sendEmail(emailMessage);

    }
}
