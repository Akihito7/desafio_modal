import java.util.Scanner;

public class Desafio01_modal{

    public static int contarLetra(String phrase, char word) {

        int quantidadeLetras = 0;

        for (int i = 0; i < phrase.length(); i++) {

            if (phrase.charAt(i) == word) {

                quantidadeLetras++;
            }
        }
        return quantidadeLetras;
    }
public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Me conte um segredo");

        String phrase = scan.nextLine();

        scan.close();

        char word = 'a';

        int amount_of_letters = contarLetra(phrase, word);

        System.out.printf("A quantida de letras %s é: %s",word,amount_of_letters);

    }
 
}

