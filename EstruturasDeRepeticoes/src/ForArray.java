//ARRAY É UM CONJUNTO DE ELEMENTOS DE UM TIPO CORRESPONDENTE
//PODEMOS TER UMA ARRAY STRING - INT - DOGS - FUNCIONARIOS - CLIENTE E ETC

public class ForArray {
 public static void main(String[] args) {
  String alunos [] = {"Felipe","Jonas","Julia","Marcos"};
   for(int x=0; x < alunos.length; x++){
      System.out.println("O aluno no indice x= " + x + " e " + alunos [x]);
   }

//FOR-EACH - PARA CADA
//PARA CADA NOME NA ARRAY ALUNOS, ITERAR NA VARIAVEL ALUNO
   for (String aluno : alunos) {
    System.out.println("O nome dos alunos são: "+ aluno);
   }

//BREAK - PARAR, INTERROMPER

 for(int numero = 1; numero <=5; numero++){
   if (numero == 3) 
      break;
       System.out.println(numero);
 }

 //CONTINUE -  A ITERAÇÃO CONTINUA POREM PULA A ITERAÇÃO ATUAL
 for(int numero = 1; numero <=5; numero++){
  if (numero == 3) 
     continue;
      System.out.println(numero);
}


 }

  
}
