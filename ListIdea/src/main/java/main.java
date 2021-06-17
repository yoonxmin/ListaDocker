import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lista lista = new Lista();

        String nomeLista, nomeConteudo;
        boolean mood = true;

        System.out.println("escreva o nome da lista:");
        nomeLista = scanner.nextLine();
        lista.setNomeLista(nomeLista);

        while(mood) {
            System.out.println("escreva o nome dos conteudos:");
            nomeConteudo = scanner.nextLine();
            if(nomeConteudo.equalsIgnoreCase("fim")){
                mood = false;
            }
            lista.addNome(nomeConteudo);
        }
        System.out.println(lista.getNomeLista());
        System.out.println(lista.getNome());

    }
}
