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
        System.out.println("2 - Remover item");
        System.out.println("3 - Listar items");
        System.out.println("4 - Sair");

        int op = in.nextInt();
        switch(op){
            case 1:
                biblioteca.cadastrar(item.cadastro(in));
                menuStart();
                break;
            case 2:
                biblioteca.remover(in);
                menuStart();
                break;
            case 3:
                biblioteca.showAll();
                menuStart();
                break;
            default:
                biblioteca.showAll();
                menuStart();
                break;
        }
    }
}

