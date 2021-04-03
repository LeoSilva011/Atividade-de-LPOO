
package atividade2;


public class Secretario extends Funcionario {
    
      @Override
      public void CalcularBonificacao(double salario){
        this.salario=salario+(salario*0.05);
    }
      
    @Override
    public void Imprimir(){
       
        System.out.println("\nSecretario ");
        System.out.println("Salario mais bonificação: "+this.salario);
   }
    
}
