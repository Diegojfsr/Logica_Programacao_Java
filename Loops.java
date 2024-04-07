import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
        For - Enquanto i < 100 faca.

        for(int i = 0; i <= 100; i++){
            System.out.println("Nesta repeticao o I tem valor de: " + i);
        }
        */

        /*
        //While - Faca ate que valorMisterioso == 26.

        Scanner scanner = new Scanner(System.in);
        var valorMisterioso = 0;
        while(valorMisterioso != 26){
            System.out.println("Adivinhe o Valor!");
            valorMisterioso = scanner.nextInt();
            if(valorMisterioso == 26){
                System.out.println("Você Acertou! Parabéns!!");
            }else{
                System.out.println("Você Errou! Tente Novamente.");
            }
        }
        */

        // doWhile - Faca enquanto valor < 12.

        int valor = 0;
        do{
            System.out.println(valor);
            valor++;
        }while(valor < 12);
    }
    
}
