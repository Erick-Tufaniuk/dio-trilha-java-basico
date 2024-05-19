public class Usuario {

  public static void main(String[] args) {
    
    SmartTV smartTv = new SmartTV();
    
    System.out.println("Tv Ligada ?"+ smartTv.ligada);
    System.out.println("Canal atual :"+ smartTv.canal);
    System.out.println("Volume atual :"+ smartTv.volume);
    
    //LIGANDO A TV

    smartTv.ligar();
    System.out.println("Novo status - TV ligada ? " + smartTv.ligada); 
    
    smartTv.abaixarVolume();
    smartTv.abaixarVolume();
    smartTv.abaixarVolume();
    smartTv.aumentarVolume();
    System.out.println("Volume atual: "+ smartTv.volume);

    System.out.printf("Volume padrao fabrica %d%n", smartTv.volume);
    smartTv.abaixarVolume();
    smartTv.abaixarVolume();
    smartTv.abaixarVolume();
    smartTv.abaixarVolume();
    smartTv.abaixarVolume();
    System.out.printf("Abaixar volume: %d%n", smartTv.volume);

    System.out.println("Canal atual: "+ smartTv.canal);

    smartTv.aumentarCanal();
    smartTv.aumentarCanal();
    smartTv.aumentarCanal();
    smartTv.aumentarCanal();
    System.out.println("Canal atual: "+ smartTv.canal);

    smartTv.diminuirCanal();
    smartTv.diminuirCanal();
    System.out.println("Canal atual: "+ smartTv.canal);

    smartTv.canalManual(33);
    smartTv.canalManual(58);
  
    
  
  }
  
}
