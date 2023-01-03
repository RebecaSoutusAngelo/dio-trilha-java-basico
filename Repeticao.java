package Operadores;

public class Repeticao {
    public static void main(String[] args) {

        int numero = 5;
        //x repetição
        numero++;
        //mesmo que numero = numero +1;

        System.out.print(numero);
        //Não pode colocar o numero++ na opção final, pois precisa primeiro apresentar o valor, depois o incremento e por fim a impressão.
        //O que pode ser feito:
        System.out.print(++ numero);

        //para subtração
        numero--;
        System.out.print(numero);

    }
}
