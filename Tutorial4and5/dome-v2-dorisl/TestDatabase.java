public class TestDatabase
{
    public static void main(String args[]) {
        Database db = new Database();
        // uncomment all statements below after you create the class CD, Video and VideoGame
        /*
        CD cd1 = new CD("Joey & Joey", "Joey Yung", 11, 60);
        CD cd2 = new CD("Miss You Mix", "Leslie Cheung", 12, 70);
        Video video1 = new Video("Matrix", "Wachowski Brothers", 137);
        Video video2 = new Video("Star Trek", "J. J. Abrams", 127);
        VideoGame videoGame1 = new VideoGame("Final Fantasy", "Windows", 2, 30);
        
        db.addItem(cd1);
        db.addItem(cd2);
        db.addItem(video1);
        db.addItem(video2);
        db.addItem(videoGame1);
        
        cd1.setComment("My favorite album");
        cd2.setComment("Best album");
        video1.setComment("My favorite movie");
        videoGame1.setComment("My favorite VideoGame");
        cd1.setOwn(true);
        video1.setOwn(true);
        videoGame1.setOwn(true);
        */
        db.list();
}
}
