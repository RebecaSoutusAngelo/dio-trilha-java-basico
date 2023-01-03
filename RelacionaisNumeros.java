package Operadores;

public class RelacionaisNumeros {

    // Avaliam a relação entre duas variáveis.
    // == se dois valores são iguais.
    // != se dois valores são diferentes.
    // > se é maior.
    // >= se é maior ou igual.
    // < se é menor.
    // <= seé menor igual.
    public static void main(String[] args) {

    int numero1 = 1;
    int numero2 = 2;

    boolean simNao = numero1 == numero2;

    if(numero1 < numero2){
        System.out.print ("a nossa condição é verdadeira");

    }

    System.out.print ("numeroUm é igual a numeroDois?" + simNao);

    simNao = numero1 != numero2;
 
 }   
}
