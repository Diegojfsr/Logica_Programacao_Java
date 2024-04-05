public class OperadoresRelacionais {
    public static void main(String[] args) {

        double primeiroDouble = 123.4;
        double segundoDouble = 456.7;
        if(primeiroDouble > segundoDouble){
            System.out.println("É Maior!");
        }else{
            System.out.println("É Menor!");
        };

        if(primeiroDouble < segundoDouble){
            System.out.println("É Maior!");
        }else{
            System.out.println("É Menor!");
        };
       

        double terceiroDouble = 123.4;
        double quartoDouble = 123.4;

        if(terceiroDouble >= quartoDouble){
            System.out.println("É Maior/Igual!");
        }else{
            System.out.println("É Menor!");
        };

        if(terceiroDouble <= quartoDouble){
            System.out.println("É Menor/Igual!");
        }else{
            System.out.println("É Maior!");
        };

    }
}
