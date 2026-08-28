import java.util.List;

public class CDs extends Item{

    private String Genre;
    List<String> tracklist;

    public CDs(int id, String title, String genre, List<String> tracklist) {
        super(id, title);
        Genre = genre;
        this.tracklist = tracklist;
    }

    public void AddTracks(String song){
        tracklist.add(song);
    }
}
