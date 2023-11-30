import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
       // System.out.println("Digite o valor do salario desejado!");

        Scanner scan = new Scanner(System.in);
        double valorDesejado =0;
        valorSalario(valorDesejado);
        String [] candidatos = {"Gabriel", "carlos", "joao", "Cesar","Maria", "Joana","Juliana", "Mylena"};
        int posAtualAprovados=0;
        String [] candidatosAprovados ={"","","","",""} ;
        double max = 2500;
        double min = 1500;
        for(int i =0; i<candidatos.length;i++)
        {
            if(posAtualAprovados==5)
                break;
           
            valorDesejado=ThreadLocalRandom.current().nextDouble(min,max);
            //System.out.println(valorDesejado);
            
            if(valorSalario(valorDesejado)==1 || valorSalario(valorDesejado)==2)
            {
                 
              
                                System.out.println(posAtualAprovados);
               // System.out.println("O candidato " + candidatos[i] + "Tem proposta de " + valorDesejado);
                candidatosAprovados[posAtualAprovados]=candidatos[i];
               // System.out.println("a posicao atual do array é "+posAtualAprovados);
                posAtualAprovados++;
                
                
            }
}

        

       
     for (String candidatosAprovados2 : candidatosAprovados) {
        System.out.println(candidatosAprovados2);
        
     }

     for (String candidatosAprovados2 : candidatosAprovados) {
        int retorno = entrarEmContato();
        if(retorno!=4)
        System.out.println("O candidato" + candidatosAprovados2+ " Atendeu na ligacao "+ retorno);
        else 
        System.out.println("o candidato " + candidatosAprovados2 + " nao atnedeu a ligacao");
        
     }
     entrarEmContato();
    }


    static public int valorSalario( double salario)
    {
        double salariomax=2000.0;
        int value=0;
        if(salario<salariomax){
       // System.out.println("Ligar para o candidato");
        value= 1;
        }
        else if(salario ==salariomax){
       // System.out.println("Ligar para o candidato com contra proposta");
        value= 2;
        }
        else if(salario>=salariomax){
       // System.out.println("Aguardando resultado para os demais candidatos");
        value= 3;
        }
        return value;
    }

    static int  entrarEmContato ()
    {
        int tentativa = 0;
        boolean atendeu =false;
        while(tentativa <3 && atendeu==false)
        {
            atendeu =  ThreadLocalRandom.current().nextBoolean();
            //System.out.println(atendeu);
            tentativa++;
        }
        if(atendeu ==false)
        tentativa= 4;
        return tentativa;
    }
}
