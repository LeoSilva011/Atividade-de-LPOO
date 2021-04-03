
package atividade;
    
  

public class Conta {
      
    protected double saldo;
    protected String nome;
    protected int numero;
    protected double sacar;

    
    public Conta(double saldo, String nome, int numero, double sacar) {
        this.saldo = saldo;
        this.nome = nome;
        this.numero = numero;
   
    }

    public Conta() {
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSacar() {
        return sacar;
    }

    public void setSacar(double sacar) {
        this.sacar = sacar;
    }

    
    public void verSaldo(){
        
    }
    
    
    public void TipoDaConta(){
        
        
    }
    
    public void Depositar(){
        
        
    }
    
    public void escolha(){
        
    }
  
}
