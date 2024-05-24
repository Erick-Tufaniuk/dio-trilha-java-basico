import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoDeExcecoes {
    public static void main(String[] args){
        try{
        Scanner sc = new Scanner(System.in);

        String nome;
        String sobreNome;
        int idade;
        double altura;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite seu sobrenome: ");
        sobreNome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        System.out.println("Digite sua altura: ");
        altura = sc.nextDouble();

        System.out.println(nome);
        System.out.println(sobreNome);
        System.out.println(idade);
        System.out.println(altura);

        sc.close();
        } catch(InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numericos !");
        }

    }
}
