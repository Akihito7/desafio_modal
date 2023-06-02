import java.util.ArrayList;
import java.util.Scanner;

public class Desafio03_modal{
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
 
    System.out.println("Digite o texto! ");
    
    String entradaDados = scan.nextLine();
    scan.close();

    String[] valores = entradaDados.split(",");
    ArrayList<Double> numeros = new ArrayList<Double>();
    ArrayList<String> textos = new ArrayList<String>();

    for(String valor : valores){
        if(isNumero(valor)){

            numeros.add(Double.parseDouble(valor));
        }
        else{
            textos.add(valor);
        }
    }

    Double[] arrayDoubles = new Double[numeros.size()];
    String[] arrayString = new String[textos.size()];

    System.out.println("Dados númericos resgatados da String");

    for(int y = 0; y < numeros.size(); y++){
        arrayDoubles[y] = numeros.get(y);
        System.out.println(arrayDoubles[y]);
    }
    
    System.out.println("Dados em texto resgatados da String");
    for(int y = 0; y < textos.size(); y++){
        arrayString[y] = textos.get(y);
        System.out.println(arrayString[y]);
    }
      
    }

    private static boolean isNumero(String valor) {
        try {
            Double.parseDouble(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

}
}

