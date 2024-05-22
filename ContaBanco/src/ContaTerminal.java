public class ContaTerminal{
 
//atributos

  private int conta;
  private String agencia;
  private String nomeCliente;
  private String sobreNomeCliente;
  private double saldo;


//Getters e setters

public void setConta(int conta){
  this.conta = conta;
}
public void setAgencia(String agencia) {
  this.agencia = agencia;
}
public void setNomeCliente(String nomeCliente) {
  this.nomeCliente = nomeCliente;
}
public void setsobreNomeCliente(String sobreNomeCliente){
  this.sobreNomeCliente = sobreNomeCliente;
}
public void setSaldo(double saldo) {
  this.saldo = saldo;
}

public String getConta() {
  return "Conta: " + conta;
}
public String getAgencia() {
  return agencia;
}
public String getNomeCliente() {
  return nomeCliente;
}
public String getSobreNomeCliente(){
  return sobreNomeCliente;
}
public double getSaldo() {
  return saldo;
}

//METODOS

public void deposito(double deposito){
  saldo+= deposito;
  System.out.printf("Deposito de R$%.2f efetuado com sucesso, seu novo saldo disponivel e: %.2f.", deposito, saldo);
    
  }
}
