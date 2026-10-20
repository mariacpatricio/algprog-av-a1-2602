 import java.util.Scanner;
public class Enunciado {
    public static void main (String [] args){
        
        Scanner veja = new Scanner (System.in);

        String açucar;
        String cafe;
        String cacau;
        String algodão;
        String commodity;
        String safra;
        int valor = 0;
        double cotação;
        int perda = 120;

        System.out.println("Qual é o nome da commodity: ");
        commodity = veja.nextLine();

        System.out.println("Qual o valor da cotação?: " + 150);
        cotação = veja.nextDouble();

        System.out.println("Qual foi a perda estimada da safra?: ");
        safra = veja.nextLine();

        System.out.println("A perda foi: " + 120);
        perda = veja.nextInt();

        System.out.println("Erro: Percentual de perda de safra invalido.");
        safra = veja.nextLine();

        veja.close();





        
        
    
    }
}