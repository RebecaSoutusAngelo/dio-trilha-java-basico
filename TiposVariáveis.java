public class TiposVariáveis {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Tipos de Dados
                //palavras reservadas para a representação de tipos de dados básicos que precisam ser manipulados para a construção de programas.
                //São "tipos primitivos" ou Primitive Types.
                    //Eles são:  int, byte, short, long, float, double, boolen e char.
                        //Representam valores brutos. São armazenados diretamente na pilha de memória ou Memory stack.

    // Verifique a tabela para saber o valor de cada tipo.

        //Declaração de variáveis
            //Identificação de um espaço em memória utilizado pelo nosso programa.
            //Toda variável é composta por: tipos de dados + identificação + valor atribuído.
                // Estrutura padrão:
                //<Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>
                    //Exemplos:
                        //int idade; //número zero - não tem valor específico.
                        //int anoFabricacao = 2021;
                        //double salarioMinimo = 2.500; //não é o valor em milhar
                        //double salarioMinimo = 2500.33; //equivale a 2.500,33
                        
                //Peculiaridades - existem tipos específicos.
                    //byte idade = 123;
                    //short ano = 2021;
                    //int cep = 25444-555 //se começar com zero, provavemente precisaria de uma string
                    //long cpf = 10447380042L //se começar com zero, talvez tenha que ser outro tipo e terminar com "l"
                    //float pi = 3.14F //precisa ter um "f" no final para não ser confundido com double
                    //double salario = 1275.33

        //java é fortemente tipado
        //exemplo:
        //short numeroCurto = 1;
        //int numeroNormal = numeroCurto;
        //short numeroCurto2 = numeroNormal;

        //Faz-se necessária a adaptação de tipo. Chamada "casting".


        //Alteração de valores:
          
        int numero = 1;
        numero = 2;

                     //Variáveis e Constantes
        
       //Constantes: valores armazenados em memória que não podem ser alterados.
       //Utiliza-se: final, seguida do tipo.
       //São sempre escritas em CAIXA ALTA.
       
        //Exemplo:

        //int numero = 5; //mudanca simples de valores
        //numero = 10;

        System.out.print(numero);

        //final

      // final double VALOR_DE_PI = 3.14;
       //VALOR_DE_PI = 10.75;
       //O sistema não permite a alteração por conter CAIXA_ALTA.




        












                    }
}
