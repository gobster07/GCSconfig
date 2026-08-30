import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        Item item = new Item();
        Menu menu = new Menu(in, biblioteca, item);
        menu.menuStart();

    }
}
