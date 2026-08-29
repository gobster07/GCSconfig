public class DVDs extends Item{

private String typeOf;
private String description;

    public DVDs(int id, String title,String author, String data, String typeOf, String description) {
        super(id, title,author, data);
        this.typeOf = typeOf;
        this.description = description;
    }

    public DVDs(String typeOf, String description) {
        this.typeOf = typeOf;
        this.description = description;
    }
}
