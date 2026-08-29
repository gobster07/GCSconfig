import java.util.List;

public class CDs extends Item{

    private String Genre;
    List<String> tracklist;

    public CDs(int id, String title,String data,String author, String genre, List<String> tracklist) {
        super(id, title,author, data);
        Genre = genre;
        this.tracklist = tracklist;
    }

    public void AddTracks(String song){
        tracklist.add(song);
    }
}
