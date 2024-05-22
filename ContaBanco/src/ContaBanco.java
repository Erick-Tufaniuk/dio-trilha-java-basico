import java.util.Scanner;

public class ContaBanco{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ContaTerminal cliente = new ContaTerminal();

        
        System.out.print("Ola, bem vindo ao banco Hello World, vamos criar uma conta?\n Digite 1 para consultar saldo, 2 para criar uma conta ou 3 para encerrar:");
        int escolha = sc.nextInt();

        if (escolha == 1) {
            System.out.printf("Seu saldo e de R$%.2f",cliente.getSaldo());
            
        }else if (escolha == 2) {
            
                int conta;
                String agencia;
                String nomeCliente;
                String sobreNomeCliente;
                int escolhaDeposito;
                
                System.out.println("Otimo vamos comecar, digite seu nome: ");
                nomeCliente = sc.next();
                 cliente.setNomeCliente(nomeCliente);

                System.out.println("Digite seu sobrenome: ");
                sobreNomeCliente = sc.next();
                 cliente.setsobreNomeCliente(sobreNomeCliente);  
    
                System.out.println("Certo,agora digite a conta desejada com 4 numeros: ");
                conta = sc.nextInt();
                 cliente.setConta(conta);
    
                System.out.println("Digite o numero da agencia com cinco numeros:");
                 agencia = sc.next();
                  cliente.setAgencia(agencia);
    
                System.out.printf("Muito bem %s sua conta %d , agencia %s , foi criada com sucesso.%nGostaria de fazer um deposito em sua nova conta?%nSe sim digite 1, se nao digite 2:", nomeCliente ,conta, agencia); 
                 escolhaDeposito = sc.nextInt();
                  
                 if (escolhaDeposito == 1) {
                   double deposito; 

                    System.out.println("Digite o valor que deseja depositar:");
                     deposito = sc.nextDouble();
                      cliente.deposito(deposito);              
                 }else{
                    System.out.println("Obrigado por usar nosso banco, até a próxima.");
                 }
                
         }else {
            System.out.println("Obrigado por usar nossos servicos.");
         }
     sc.close();
    }
}