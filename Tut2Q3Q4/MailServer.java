import java.util.ArrayList;
import java.util.Iterator;

/**
 * A simple model of a mail server. The server is able to receive
 * messages for storage, and deliver them to clients on demand.
 * @author David J. Barnes and Michael Kolling
 * @version 2001.05.30
 */
public class MailServer
{
    // Storage for the arbitrary number of messages to be stored
    // on the server.
    private ArrayList<MailItem>messages;

    /**
     * Construct a mail server.
     */
    public MailServer()
    {
        messages = new ArrayList<MailItem>();
    }

    /**
     * @return How many messages are waiting for the given user.
     * @param who The user to check for.
     */
    public int howManyMessages(String who)
    {
        int count = 0;
        Iterator it = messages.iterator();
        while(it.hasNext()) {
            MailItem mess = (MailItem) it.next();
            if(mess.getTo().equals(who)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Return the next message for who. Return null if there
     * are none.
     * @param who The user requesting their next message.
     */
    public MailItem getNextMailItem(String who)
    {
        Iterator it = messages.iterator();
        while(it.hasNext()) {
            MailItem mess = (MailItem) it.next();
            if(mess.getTo().equals(who)) {
                it.remove();
                return mess;
            }
        }
        return null;
    }

    /**
     * Add the given message to the message list.
     * @param item The mail item to be stored on the server.
     */
    public void post(MailItem item)
    {
        messages.add(item);
    }
}
