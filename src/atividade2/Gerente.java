/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;


public class Gerente extends Funcionario {

    public Gerente() {
    }
    
    
       
      @Override
      public void CalcularBonificacao(double salario){
          
          this.salario=salario+(salario*0.15);
            
    }
    
    @Override
    public void Imprimir(){
        System.out.println("\nGerente ");
        System.out.println("Salario mais bonificação: "+this.salario);
        
       
   }
    
}
