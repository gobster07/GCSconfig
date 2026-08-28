public class Livro extends Item{
    private String genero;
    private int page;
    private String author;
    private String publisher;
    public Livro(int id, String title, String genero, int page,String author,String publisher){
        super(id,title);
        this.page = page;
        this.genero = genero;
        this.author = author;
        this.publisher = publisher;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
