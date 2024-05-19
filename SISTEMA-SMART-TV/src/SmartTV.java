/** 
 * <h1>Smart Tv</h1>
 * Funcionalidades de funcionamento de uma Smart TV.
 * <br>
 * <b>Nota:</b> Leia atentamente a documentação desta Classe para usufruir dos recursos
 * oferecidos pelo autor.
 * 
 * @author Erick Tufaniuk
 * @version 1.0
 * @since 19/05/2024 */
 
 //ACIMA UMA BREVE DOCUMENTAÇÃO EXPLICANDO E DANDO MAIS DETALHES SOBRE O CODIGO A SEGUIR



public class SmartTV{

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

  
    public void ligar() {
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: "+ volume);
    }

    public void abaixarVolume(){
        volume--;
        System.out.println("Abaixando o volume para: "+ volume);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Canal: " + canal);    
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Canal: "+ canal);
    }

/**
 * Este metodo é usado para acessar o canal recebido manualmente do usuario
 * @param canalDigitado - este é o primeiro e unico paramentro recebido
 * @return - N/A
 */

    public void canalManual(int canalDigitado){
        canal = canalDigitado;
        System.out.println("Canal escolhido: "+ canalDigitado);
    }
}