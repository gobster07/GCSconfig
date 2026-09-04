import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CDs extends Item{

    private String Genre;
    List<String> tracklist;

    public CDs(int id, String title,String data,String author, String genre, List<String> tracklist) {
        super(id, title,author, data);
        Genre = genre;
        this.tracklist = tracklist;
    }

    public CDs() {
        super();
        Genre = "";
        this.tracklist = new ArrayList<String>();
    }

    public void AddTracks(String song){
        tracklist.add(song);
    }

    public void cadastroTracks(Scanner in){
        System.out.println("Digite o nome da Música: ");
        String name = in.nextLine();
        this.AddTracks(name);
        System.out.println("1 - cadastrar nova música");
        System.out.println("2 - Sair");
        int op =  in.nextInt();
        switch(op){
            case 1:
                cadastroTracks(in);
                break;
            case 2:
                break;
        }
    }
}
