public class Condicionais {
    public static void main(String[] args) {
        long valor1 = 1L;
        long valor2 = 2L;

        if(valor1 == valor2){
            System.out.println("São Iguais!");
        }else if(valor1 != valor2){
            System.out.println("São Diferentes!");
        }else{
            System.out.println("Nenhum dos Dois!");
        }


        long valor3 = 1L;
        long valor4 = 1L;

        if(valor3 > valor4){
            System.out.println("É Maior!");
        }else if(valor3 == valor4){
            System.out.println("São Iguais!");
        }else{
            System.out.println("Nenhum dos Dois!");
        }
    }
    
}
