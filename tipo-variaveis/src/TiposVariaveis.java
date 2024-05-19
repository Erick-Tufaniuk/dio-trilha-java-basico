public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        
        String meuNome = "Erick Tufaniuk";
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // short numeroCurto2 = numeroNormal;
        //erro de conversao

        // Neste caso usamos o CAST (converte manualmente o tipo da varivel)]
        short numeroCurto2 = (short) numeroNormal; 


        /* CONSTANTE EM JAVA - SE DECLARA SEMPRE COM O NOME DA VARIAVEL EM 
        CAIXA ALTA E ANTES DO TIPO DA VARIAVEL USA (final) PARA QUE DE FATO SEJA
        UMA CONSTANTE*/

        final double VALOR_DE_PI = 3.14;

        // OPERADORES UNARIOS POSITIVOS, NEGATIVOS , UNARIO INCREMENTO , DECREMENTO E UNARIO LOGICO DE NEGAÇÃO

        //UNARIO POSITIVO É USADO PARA POSITVAR UM NUMERO QUANTO O NEGATIVO O TORNA NEGATIVO

        int numero = 5;

        System.out.println(numero);

        numero = - numero;
        System.out.println(numero);

        //UNARIO DE NEGAÇÃO DE VALOR !

        boolean variavel = false;

        System.out.println(! variavel);
        //O OPERADOR "!" ANTES DA VARIAVEL NEGA O VALOR FAZENDO O RESULTADO SER O INVERSO



        //OPERADOR TERNARIO 

        String a, b;

        a = "erick";
        b = "rafa";

        String resultado = a != b ? "false" : "true";
        System.out.println(resultado);

        
    }
}
