/**
 * The Video class represents a video object. Information about the 
 * video is stored and can be retrieved.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2002-05-02
 */
public class Video 
{
    private String title;
    private String director;
    private int playingTime;
    private boolean gotIt;
    private String comment;

    /**
     * Constructor for objects of class Video
     */
    public Video(String theTitle, String theDirector, int time)
    {
        title = theTitle;
        director = theDirector;
        playingTime = time;
        gotIt = false;
        comment = "<no comment>";
    }

    /**
     * Enter a comment for this video.
     */
    public void setComment(String comment)
    {
        this.comment = comment;
    }

    /**
     * Return the comment for this video.
     */
    public String getComment()
    {
        return comment;
    }

    /**
     * Set the flag indicating whether we own this video.
     */
    public void setOwn(boolean ownIt)
    {
        gotIt = ownIt;
    }

    /**
     * Return information whether we own a copy of this video.
     */
    public boolean getOwn()
    {
        return gotIt;
    }

    /**
     * Print details about this Video to the text terminal.
     */
    public void print()
    {
        System.out.println("Video");
        System.out.println("Title: " + title);
        if(gotIt) {
            System.out.println("Got it: Yes");
        } else {
            System.out.println("Got it: No");
        }
        System.out.println("Playing time: " + playingTime);
        System.out.println("Comment: " + comment);
        System.out.println("Director: " + director);
    }
}
