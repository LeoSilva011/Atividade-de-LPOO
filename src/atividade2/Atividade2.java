
package atividade2;


public class Atividade2 {

    
    public static void main(String[] args) {
        
      Engenheiro eng1 =new Engenheiro();
      Diretor dir1=new Diretor();
      Secretario se1=new Secretario();
      Gerente g1 = new Gerente();
      
      //Engenheiro
      eng1.CalcularBonificacao(5000);
      eng1.Imprimir();
        
       //Diretor 
      dir1.CalcularBonificacao(10000);
      dir1.Imprimir();
      
        //Secretario
      se1.CalcularBonificacao(1500);
      se1.Imprimir();
      
      //Gerente
      g1.CalcularBonificacao(2000);
      g1.Imprimir();
        
        
        
        
    }
    
}
