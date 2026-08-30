import java.util.Scanner;

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

    @Override
    public String toString(){
        return  id + ", " + title + ", " + author + ", " + data;
    }

    public Item cadastro(Scanner in){
        System.out.println("Qual item deseja cadastrar?");
        System.out.println("1 - Livro");
        System.out.println("2 - CD");
        System.out.println("3 - DVD");
        System.out.println("4 - Revistas");
        System.out.println("0 - Voltar");

        int op = in.nextInt();

        Item item = new Item();

        switch(op){
            case 1:
                item = this.cadastrarLivro(in);
                break;

            default:
                item = null;
                break;
        }
        return item;
    }
    public Item cadastrarLivro(Scanner in){
        System.out.println("Digite o ID do item");
        int id = in.nextInt();

        in.nextLine();

        System.out.println("Digite o nome do livro: ");
        String name = in.nextLine();

        System.out.println("Digite o Autor: ");
        String author = in.nextLine();

        System.out.println("Digite a Data de aquisição: ");
        String data = in.nextLine();

        System.out.println("Digite o gênero: ");
        String gender = in.nextLine();

        System.out.println("Digite a Editora: ");
        String editor = in.nextLine();

        Livro livro = new Livro(id,name,author,data,gender,editor);
        return livro;

    }

    public Item cadastrarDVD(Scanner in){
        System.out.println("Digite o ID do item");
        int id = in.nextInt();

        in.nextLine();

        System.out.println("Digite o título do DVD: ");
        String name = in.nextLine();

        System.out.println("Digite o Autor: ");
        String author = in.nextLine();

        System.out.println("Digite a Data de aquisição: ");
        String data = in.nextLine();

        System.out.println("Digite o tipo do DVD: ");
        String gender = in.nextLine();

        System.out.println("Digite a Descrição: ");
        String desc = in.nextLine();

        DVDs dvd = new DVDs(id,name,author,data,gender,desc);
        return dvd;

    }

    public Item cadastrarCd(Scanner in){
        System.out.println("Digite o ID do item");
        int id = in.nextInt();
        in.nextLine();

        System.out.println("Digite o título do CD: ");
        String name = in.nextLine();

        System.out.println("Digite o Autor: ");
        String author = in.nextLine();

        System.out.println("Digite a Data de aquisição: ");
        String data = in.nextLine();

        System.out.println("Digite o tipo do DVD: ");
        String gender = in.nextLine();

        System.out.println("Digite a Descrição: ");
        String editor = in.nextLine();

        Livro livro = new Livro(id,name,author,data,gender,editor);
        return livro;

    }
}
