package Operadores;

public class Unario {

     public static void main(String[] args) {
       int numero = 5;
       
//Neste caso, o código pode não alterar o número como gostaríamos.
       //System.out.print (- numero);
       //System.out.print (numero);

//melhor forma de transformar um número positivo em um negativo.
        numero = - numero;
        System.out.print (numero);
        
//para o número voltar a ser positivo
        numero = numero * -1;
        System.out.print (numero);
//ENTENDER PORQUE O RESULTADO É -55.
   }
}

