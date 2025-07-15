import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.poifs.crypt.*;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import javax.mail.*;
import javax.mail.internet.*;
import java.io.*;
import java.util.Properties;

public class PasswordProtectAndEmail {

    public static void main(String[] args) {
        // ✅ Set your actual file paths here
        String inputFile = "C:/Users/pritish/Documents/report.xlsx";
        String outputFile = "C:/Users/pritish/Documents/protected_report.xlsx";
        String password = "helper123";

        // ✅ Email configuration
        String toEmail = "recipient@example.com";
        String fromEmail = "youremail@gmail.com";
        String emailPassword = "your-app-password";
        String subject = "Password Protected Excel File";
        String body = "Please find the attached password-protected Excel file.";

        try {
            passwordProtectExcelWithAgileEncryption(inputFile, outputFile, password);
            sendEmailWithAttachment(fromEmail, emailPassword, toEmail, subject, body, outputFile);
            System.out.println("✅ File protected and emailed successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ✅ Password protect Excel using Agile encryption mode
    public static void passwordProtectExcelWithAgileEncryption(String inputFile, String outputFile, String password) throws Exception {
        POIFSFileSystem fs = new POIFSFileSystem();

        // ✅ Explicitly use AGILE encryption mode
        EncryptionInfo info = new EncryptionInfo(EncryptionMode.agile);
        Encryptor encryptor = info.getEncryptor();
        encryptor.confirmPassword(password);

        try (OPCPackage opc = OPCPackage.open(new File(inputFile), OPCPackage.OpenPackageOption.READ_WRITE);
             OutputStream os = encryptor.getDataStream(fs)) {
            opc.save(os);
        }

        try (FileOutputStream fos = new FileOutputStream(outputFile)) {
            fs.writeFilesystem(fos);
        }

        System.out.println("🔐 Excel file successfully protected using AGILE encryption.");
    }

    // ✅ Send email with the password-protected Excel file
    public static void sendEmailWithAttachment(String fromEmail, String emailPassword,
                                               String toEmail, String subject, String body,
                                               String attachmentPath) throws Exception {

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, emailPassword);
            }
        });

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(fromEmail));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
        message.setSubject(subject);

        MimeBodyPart textPart = new MimeBodyPart();
        textPart.setText(body);

        MimeBodyPart attachmentPart = new MimeBodyPart();
        attachmentPart.attachFile(new File(attachmentPath));

        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(textPart);
        multipart.addBodyPart(attachmentPart);

        message.setContent(multipart);

        Transport.send(message);
    }
}
