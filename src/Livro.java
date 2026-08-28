public class Livro extends Item{
    private String genero;
    private int page;
    private String publisher;
    public Livro(int id, String title,String data, String author, String genero, int page,String publisher){
        super(id,title,author,data);
        this.page = page;
        this.genero = genero;
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
