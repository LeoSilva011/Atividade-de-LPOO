
package atividade2;


public class Diretor extends Funcionario {
    
      @Override
      public void CalcularBonificacao(double salario){
        this.salario=salario+(salario*0.10);
    }
    
      
      
    @Override
    public void Imprimir(){
       
        System.out.println("\nDiretor "); 
        
        System.out.println("Salario mais bonificação: "+this.salario);
   }      
}
