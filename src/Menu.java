import java.util.Scanner;
public class Menu {
    private Scanner in;
    private Biblioteca biblioteca;
    private Item item;


    public Menu(Scanner in, Biblioteca biblioteca, Item item){
        this.in = in;
        this.biblioteca = biblioteca;
        this.item = item;
    }

    public void menuStart(){
        System.out.println("Escolha uma opção");
        System.out.println("1 - Cadastrar novo item");
        int op = in.nextInt();
        switch(op){
            case 1:
                biblioteca.cadastrar(item.cadastrarLivro(in));
                menuStart();
                break;
            default:
                biblioteca.showAll();
                break;
        }
    }
}

