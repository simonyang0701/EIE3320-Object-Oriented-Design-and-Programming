
/**
 * Write a description of class TestMail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestMail
{
    public static void main(String[] args){
        MailServer ms = new MailServer(); //Line A(Question 4 has been tested)
        MailClient mc1 = new MailClient(ms,"Peter");
        MailClient mc2 = new MailClient(ms,"Paul");
        mc1.sendMessage("Paul","Hello, I am Peter");
        mc2.sendMessage("Peter","Hello, I am Paul");
        mc1.printNextMailItem();
        mc2.printNextMailItem();
    }
}
