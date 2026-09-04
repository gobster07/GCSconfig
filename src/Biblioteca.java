import java.util.ArrayList;
import java.util.Scanner;
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

    public void remover(Scanner in){
        System.out.println("Digite o id do item que deseja remover: ");
        int id = in.nextInt();
        lista.removeIf(i -> i.getId() == id);
    }

    public void pesquisarPorAssunto(Scanner in){
        System.out.println("Digite o assunto que deseja pesquisar: ");
        String assunto = in.nextLine();
        for(int i = 0; i < lista.size(); i++){
            Item item = lista.get(i);
            if(item instanceof Revista){
                Revista revista = (Revista) item;
                if(revista.trataDoAssunto(assunto)){
                    System.out.println(revista.toString());
                }
            }
        }
    }

    public ArrayList<Item> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Item> lista) {
        this.lista = lista;
    }
}
