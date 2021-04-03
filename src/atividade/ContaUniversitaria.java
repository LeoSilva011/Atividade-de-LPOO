
package atividade;

import java.util.Scanner;

public class ContaUniversitaria extends Conta {

  
    
    private double depositar;

    public ContaUniversitaria(double depositar, double saldo, String nome, int numero, double sacar) {
        super(saldo, nome, numero, sacar);
        this.depositar = depositar;
    }

    public ContaUniversitaria() {
    }


 
    
    

    public double getDepositar() {
        return depositar;
    }

    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

 Scanner scan=new Scanner(System.in);
    
    
    
    @Override
    public void TipoDaConta(){
        System.out.println("Conta universitária");
        
    }
    
    
  
    
    @Override
    public void Depositar(){
        
        System.out.println("Quanto deseja depositar ? ");
        this.depositar =scan.nextDouble();
        
        this.saldo = this.saldo+this.depositar+(this.depositar*0.05);
        System.out.println("Valor depositado: "+this.depositar+" mais 5%");
        
    }
    
    
    @Override
    public void verSaldo(){
        System.out.println("Seu saldo: "+this.saldo);    
        
    }
    

    
    
    
}
