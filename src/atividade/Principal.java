package atividade;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        ContaEspecial contaEsp1 = new ContaEspecial();
        ContaPoupanca poupanca1 = new ContaPoupanca();
        ContaUniversitaria univer1 = new ContaUniversitaria();
        
        poupanca1.setSaldo(1000);
        poupanca1.setSaldoPoupanca(1500);
        
        
        contaEsp1.setSaldo(2000);
        contaEsp1.setLimite(2500);
        
        Scanner scan = new Scanner(System.in);
  

        boolean condicao = true;
        while (condicao) {
        System.out.println("Escolha uma Opção");
        System.out.println("Conta poupança - 1");
        System.out.println("Conta especial - 2");
        System.out.println("Conta universitaria - 3");     
            int opcao = scan.nextInt();
            switch (opcao) {

                case 1:
                    poupanca1.TipoDaConta();
                    
                    poupanca1.verSaldo();
                    poupanca1.escolha();
                    poupanca1.verSaldo();
                    
                    condicao = false;
                    break;
                case 2:
                    contaEsp1.TipoDaConta();
                    contaEsp1.verSaldo();
                    contaEsp1.escolha();
                    contaEsp1.verSaldo();
                    condicao = false;
                    break;
                case 3:
                    univer1.Depositar();
                    univer1.verSaldo();
                    
                    condicao = false;
                    break;
                default:
                    System.out.println("Opção invalida");

            }

        }

    }
}
