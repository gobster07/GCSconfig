import java.util.ArrayList;
public class Biblioteca {
    private ArrayList<Item> lista;

    public Biblioteca(){
        lista = new ArrayList<Item>();
    }

    public void cadastrar(Item item){
        if(item != null) {
            lista.add(item);
        }

    }

    public void showAll(){
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i).toString());
        }
    }

}
