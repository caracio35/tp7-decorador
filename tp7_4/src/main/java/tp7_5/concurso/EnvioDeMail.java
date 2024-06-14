package tp7_5.concurso;

public interface EnvioDeMail {

    public void sendEmail(String recipient, String subject, String body);

    public String envioDeMail(String dirMail);
}
