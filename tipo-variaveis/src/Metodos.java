public class Metodos {
  
  //EXEMPLOS DE METODOS 

  //METODOS COM A PALAVRA CHAVE RETURN ESPERAM UM VALOR DE VOLTA AO CHAMADOR DO METODO

  public double somar(int num1, int num2){
      return num1 + num2;
  }

  //METODO QUE TEM A PALVRA CHAVE VOID NAO RETORNA VALORES

  public void imprimirString(String texto){
      System.out.println(texto);
  }

  //EXEMPLO DE COMO FUNCIONA O TRATAMENTO DE EXCEÇOES - THROWS EXCEPTION

  public double dividir (int dividendo, int divisor) throws Exception {
      return dividendo / divisor;
  }

  //MODIFICADORES DE ACESSO PRIVADOS NAO SAO VISTOS EM OUTRAS CLASSES

  private void metodoPrivado(){

  }

    

}
