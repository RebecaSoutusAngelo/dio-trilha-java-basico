package Operadores;

public class TernarioFalso {

    //Condição Ternária é representada por ?:
    //Organiza-se:
    //<Expressão Condicional> ? <Caso a condição seja true> : <Caso a condição seja false> 
             public static void main(String[] args) {
    
                int a,b;

                a = 5;
                b = 6;

                String resultado = "";
            if(a==b)
                resultado = "verdadeiro";
            else
                resultado = "falso";

                System.out.print(resultado);
 
 }
}
