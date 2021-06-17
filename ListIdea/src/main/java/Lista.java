import java.lang.reflect.Array;
import java.util.ArrayList;

public class Lista {
    int id;
    String nome;
    String nomeLista;
    ArrayList<String> conteudo = new ArrayList<String>();

    public ArrayList<String> getNome() {
        return conteudo;
    }
    public void addNome(String nome) {
        this.nome = nome;
        conteudo.add(this.nome);
    }

    public String getNomeLista() {
        return nomeLista;
    }

    public void setNomeLista(String nomeLista) {
        this.nomeLista = nomeLista;
    }


}
