package atividade;

import java.util.Scanner;

public class ContaEspecial extends Conta {

    private double limite;

    public ContaEspecial(double limite, double saldo, String nome, int numero, double sacar) {
        super(saldo, nome, numero, sacar);
        this.limite = limite;
    }

    public ContaEspecial() {

    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;

    }

    
    Scanner scan=new Scanner(System.in);
    
    public void Sacar(double sacar) {
        System.out.println("Quanto deseja sacar ?");
        
        sacar =scan.nextDouble();
        
        if (sacar > this.saldo) {
            this.saldo -= sacar;
            
            System.out.println("Saldo negativo " + this.saldo);
            System.out.println("Valor sacado: " + sacar);
            System.out.println("=================================");
        } else {
            this.saldo -= sacar;
        
            System.out.println("Saldo positivo " + this.saldo);
            System.out.println("Valor sacado: " + sacar);
            System.out.println("=================================");
        }

    }

    public void Sacar() {
       System.out.println("Quanto deseja sacar ?");
        
        this.sacar =scan.nextDouble();
        
        if (this.sacar > this.limite) {
            this.limite -= this.sacar;
         
            System.out.println("Saldo negativo " + this.limite);
            System.out.println("Valor sacado: " + this.sacar);
            System.out.println("=================================");
        } else {
            this.limite -= this.sacar;
     
            System.out.println("Saldo positivo " + this.limite);
            System.out.println("Valor sacado: " + this.sacar);
            System.out.println("=================================");
        }
    }

    @Override
    public void escolha(){
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Escolha uma opção");
        System.out.println("Sacar do saldo - 1");
        System.out.println("Sacar do limite - 2");
        
        
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
    public void verSaldo() {
     
        System.out.println("Saldo da saldo " + this.saldo);
        System.out.println("Saldo do limite "+this.limite);
        System.out.println("========================================");

    }

    @Override
    public void TipoDaConta() {
        System.out.println("============= Conta especial ================");

    }

}
