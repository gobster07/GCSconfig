public class Item {
    private int id;
    private String title;
    private String data;
    private String author;

    public Item (int id, String title,String author,String data){
        this.id = id;
        this.title = title;
        this.author = author;
        this.data= data;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Item () {
        this.id = -1;
        this.title = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
