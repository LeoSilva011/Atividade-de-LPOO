
package atividade2;


public class Engenheiro  extends Funcionario{

    
      @Override
      public void CalcularBonificacao(double salario){
          
       this.salario=salario+(salario*0.05); 
    }    
      
    @Override
    public void Imprimir(){
       
        System.out.println("\nEngenheiro ");
        System.out.println("Salario mais bonificação: "+this.salario);
        
   }
    
}
