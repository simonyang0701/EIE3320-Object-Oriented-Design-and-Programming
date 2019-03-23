import java.util.ArrayList;
import java.util.Iterator;
/**
 * A class to maintain an arbitrarily long list of notes.
 * Notes are numbered for external reference by a human user.
 * In this version, note numbers start at 0.
 * @author David J. Barnes and Michael Kolling.
 * @version 2001.06.08
 */
public class Notebook
{
    // Storage for an arbitrary number of notes.
    private ArrayList<String>notes;
    private int size;

    /**
     * Perform any initialization that is required for the
     * notebook.
     */
    public Notebook()
    {
        notes = new ArrayList<String>();
    }

    /**
     * Store a new note into the notebook.
     * @param note The note to be stored.
     */
    public void storeNote(String note)
    {
        notes.add(note);
    }

    /**
     * @return The number of notes currently in the notebook.
     */
    public int numberOfNotes()
    {
        return notes.size();
    }

    /**
     * Remove a note from the notebook if it exists.
     * @param noteNumber The number of the note to be removed.
     */
    public void removeNote(int noteNumber)
    {
        if(noteNumber < 1) {
            // This is not a valid note number, so do nothing.
            System.out.println("This is not a valid note number!");
        }
        else if(noteNumber < numberOfNotes()+1) {
            // This is a valid note number.
            notes.remove(noteNumber-1);
        }
        else {
            // This is not a valid note number, so do nothing.
            System.out.println("This is not a valid note number!");
        }
    }
    public void showNote(int noteNumber)
    {
        if(noteNumber < 0) {
            // This is not a valid note number, so do nothing.
            System.out.println("This is not a valid note number!");
        }
        else if(noteNumber < numberOfNotes()) {
            // This is a valid note number, so we can print it.
            System.out.println(notes.get(noteNumber));
        }
        else {
            // This is not a valid note number, so do nothing.
            System.out.println("This is not a valid note number!");
        }
    }

    /**
     * List all notes in the notebook.
     */
    
    public void listNotes()//question (a)-(f)
    {
        int index = 0;
        size = notes.size();
        while(index < size) {
            System.out.println((index+1)+": "+notes.get(index));
            index++;
        }
    }
    /*
    public void listNotes()//question (g)
    {
        int index = 0;
        size = notes.size();
        for (Iterator iter = notes.iterator(); iter.hasNext();) {
             String str = (String)iter.next();
             System.out.println((index+1)+": "+str);
             index++;
        }
    }
    */
   /**
    * 
    * Question (g)
    * State the advantage(s) of using Iterator instead of array indexing in accessing the array list.
    * Answer:
    * You can navigate or access a List by using the get(index) method or an Iterator. Sometimes the get(index) method is your only option, and sometimes it's slightly faster than an Iterator. 
    * Other times, however, it can be much, much slower than an Iterator. For example, a LinkedList is a classic example. This class has a get(index) method but it is very slow. 
    * Well, it's not that bad if the list is short, or if you're looking for an item that is close to the beginning or end. But if you need to access the List frequently, you will see a big difference.
    * 
    */
}
