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

    public void canalManual(int canalDigitado){
        canal = canalDigitado;
        System.out.println("Canal escolhido: "+ canalDigitado);
    }
}