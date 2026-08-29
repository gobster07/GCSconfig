import java.util.Scanner;
 class Livro extends Item{
    private String genero;
    private String publisher;
    public Livro(int id, String title,String data, String author, String genero,String publisher){
        super(id,title,author,data);
        this.genero = genero;
        this.publisher = publisher;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String toString(){
        return super.toString()+" "+genero+" "+publisher;
    }


}
