import java.util.ArrayList;
public class Biblioteca {
    private ArrayList<Item> lista;

    public Biblioteca(ArrayList<Item> lista){
        lista = new ArrayList<>();
    }

    public void cadastrar(Item item){
        lista.add(item);
    }

}
