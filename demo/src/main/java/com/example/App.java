package com.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        System.out.println( "Bem vindo ao programa!" );
        programa();
    }

    public static void tabuada(int numero){
        int resultado =0;
        int contador = 1;
        System.out.println("Tabuada do "+numero);
        while (contador<=10) {
            resultado=numero*contador;
            System.out.println(numero+" * "+contador+" = "+resultado);
            contador++;
        }
    }

    public static void mostraPalavra(String palavra){
        
        System.out.println("A palavra digitada foi: "+palavra);
        
    }

    public static void programa(){
        Scanner scanner = new Scanner(System.in);
        int continua=1;
        do{
            System.out.println("Escolha a funcionalidade:\n");
            System.out.println("1 - Mostrar Palavra digitada \n");
            System.out.println("2 - Tabuada\n");

            int opcao=Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1 :
                    System.out.println("Digite uma palavra:");
                    String palavra=scanner.nextLine();
                    mostraPalavra(palavra);
                    break;

                case 2 :
                    System.out.println("Digite um numero para calular a tabuada: ");
                    int numero=Integer.parseInt(scanner.nextLine());
                    tabuada(numero);
                    break;
            
                default:
                    System.out.println("Opcao invalida. tente novamente");
                    break;
            }
            System.out.println("==================");
            System.out.println("Deseja continuar? Digite 1 para sim e 0 para não: ");
            continua=Integer.parseInt(scanner.nextLine());
        }while(continua==1);
    }
}
