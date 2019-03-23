
/**
 * Write a description of class VideoGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class VideoGame
{
    // instance variables - replace the example below with your own
    private String title;
    private String platform;
    private int numberOfPlayers;
    private int playingTime;
    private boolean gotIt;
    private String comment;
    public VideoGame(String theTitle, String thePlatform, int theNumber,int time)
    {
        title = theTitle;
        platform = thePlatform;
        numberOfPlayers = theNumber;
        playingTime = time;
        gotIt = false;
        comment = "<no comment>";
    }
    public void setComment(String comment)
    {
        this.comment = comment;
    }
    public String getComment()
    {
        return comment;
    }
    public void setOwn(boolean ownIt)
    {
        gotIt = ownIt;
    }
    public boolean getOwn()
    {
        return gotIt;
    }
    public void print()
    {
        System.out.println("VideoGame");
        System.out.println("Title: " + title);
        if(gotIt) {
            System.out.println("Got it: Yes");
        } else {
            System.out.println("Got it: No");
        }
        System.out.println("Playing time: " + playingTime);
        System.out.println("Comment: " + comment);
        System.out.println("Platform: " + platform);
        System.out.println("No. of players: " + numberOfPlayers);
    }
    
}
