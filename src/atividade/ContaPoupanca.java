
package atividade;

import java.util.Scanner;




public class ContaPoupanca extends Conta{

    
    private double saldoPoupanca;

    public ContaPoupanca(double saldo, String nome, int numero,double sacar) {
        super(saldo, nome, numero,sacar);
    }
 public ContaPoupanca() {
  }
   
    
    
    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
        
        
    }

Scanner scan=new Scanner(System.in);

    public void Sacar(double sacar){
        
        System.out.println("Quanto deseja sacar ?");
        
        this.sacar =scan.nextDouble();
        sacar=this.sacar;
        if(sacar>this.saldoPoupanca){
            System.out.println("=================================");
            System.out.println("Saldo insuficiênte ");
            System.out.println("=================================");
        }else{
            this.saldoPoupanca-=sacar;
            System.out.println("=================================");
             System.out.println("Valor de "+this.sacar+" sacado da poupança");
             System.out.println("=================================");

        }
    }
    
    public void Sacar(){
        
        System.out.println("Quanto deseja sacar ?");
        this.sacar =scan.nextDouble();
            if(sacar>this.saldo){
            System.out.println("=================================");
            System.out.println("Saldo insuficiênte ");
            System.out.println("=================================");
        }else{
            this.saldo-=sacar;
            System.out.println("=================================");
             System.out.println("Valor de "+this.sacar+" sacado do saldo");
             System.out.println("=================================");
        }
    }
    
    
    @Override
    public void escolha(){
        
        System.out.println("Escolha a conta ");
        System.out.println("Sacar da poupança - 1");
        System.out.println("Sacar do saldo - 2");
              
        int opcao=scan.nextInt();
        
        
        switch(opcao){
            case 1:
                Sacar(sacar);
            break;
            case 2:
                Sacar();
            break;
            default:
                System.out.println("Opção invalida");
        }
        
        
    }
    
    
    @Override
    public void verSaldo(){
        System.out.println("Saldo da conta Poupança: "+this.saldoPoupanca);
        System.out.println("Saldo "+this.saldo);
        System.out.println("=================================");
        
        
    }
    
    
    
    
        @Override
        public void TipoDaConta(){
            System.out.println("========== Conta poupança ==1==========");
        
    }
    
}
