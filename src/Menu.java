import java.util.Scanner;
public class Menu {
    private Scanner in;
    private Biblioteca biblioteca;


    public Menu(Scanner in, Biblioteca biblioteca){
        this.in = in;
        this.biblioteca = biblioteca;
    }

    public void menuStart(){
        System.out.println("Escolha uma opção");
        System.out.println("1 - Cadastrar novo item");
        int op = in.nextInt();
        switch(op){
            case 1:

        }
    }
}

