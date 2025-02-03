import javax.print.DocFlavor.STRING;

public class Boolean2 {
    public static void main(String[] args) {
        String nomeUm = "Jean";
        String nomeDois = new String("Jeana");
        System.out.println (nomeUm == nomeDois);
        //System.out.println (nomeUm.equals(nomeDois)); recomendação para objetos usar o equals"



        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        
        if(numero1 < numero2){
            System.out.println("a nossa condição é verdadeira.");
        }

        System.out.println("numeroUm é igual a numeroDois? " + simNao );

        simNao = numero1 != numero2;
        
        System.out.println("numeroUm é diferente de numeroDois? " + simNao );
        
        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao );
    }
}
