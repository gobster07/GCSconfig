import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Revista extends Item {

    private int ano;
    private String volume;
    private String editora;
    private List<String> assuntos;

    public Revista(int id, String title, String author, String data, int ano, String volume, String editora, List<String> assuntos) {
        super(id, title, author, data);
        this.ano = ano;
        this.volume = volume;
        this.editora = editora;
        this.assuntos = assuntos;
    }

    public Revista() {
        super();
        this.ano = 0;
        this.volume = "";
        this.editora = "";
        this.assuntos = new ArrayList<String>();
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public List<String> getAssuntos() {
        return assuntos;
    }

    public void setAssuntos(List<String> assuntos) {
        this.assuntos = assuntos;
    }

    public void addAssunto(String assunto) {
        assuntos.add(assunto);
    }

    public void cadastroAssuntos(Scanner in) {
        System.out.println("Digite um assunto abordado pela revista: ");
        String assunto = in.nextLine();
        this.addAssunto(assunto);
        System.out.println("1 - cadastrar novo assunto");
        System.out.println("2 - Sair");
        int op = in.nextInt();
        in.nextLine();
        switch (op) {
            case 1:
                cadastroAssuntos(in);
                break;
            case 2:
                break;
        }
    }

    public boolean trataDoAssunto(String assunto) {
        for (String a : assuntos) {
            if (a.equalsIgnoreCase(assunto)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + ano + ", " + volume + ", " + editora + ", " + assuntos;
    }
}
