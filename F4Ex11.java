/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package f4ex11;
import static f4ex11.Banco.intro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class F4Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.println("Insira o seu nome");
        String nome=in.next();
        System.out.println("Insira o tipo de conta que deseja");
        String tipo = in.next();
        System.out.println("Insire o numero de conta");
        int conta = in.nextInt();
        Banco b = new Banco(nome,tipo,conta);
        System.out.println("Escolhe uma das seguintes opcoes");
        System.out.println("1.Opcoes de conta");
        System.out.println("2.Operacoes");
        int op = in.nextInt();
        switch (op){
        case 1:
            System.out.println("1.Criar Conta");
            System.out.println("2.Selecionar Conta");
            System.out.println("3.Remover Conta");
            System.out.println("4.Gerar Relatorio");
            System.out.println("5.Finalizar");
            switch (op){
                case 1:
                    b.abrirConta(tipo);
                  intro.add(b);
                    System.out.println("Conta aberta com sucesso");break;
                  
                case 2:
                    break;
                case 3:
                b.fecharConta();
                intro.remove(b);
                case 4:break;
                case 5:
                    System.exit(0);
                     break;
                    
            }
        case 2:
            System.out.println("1.Depositar"); 
            System.out.println("2.Sacar");
            System.out.println("3Transferir");
            System.out.println("4.Gerar Relatorio");
            System.out.println("5.Retornar");
             switch (op){
                case 1:
                    System.out.println(b.depositar(op));break;
                case 2:
                    System.out.println(b.sacar(op));break;
                case 3:
                    System.out.println("Insira a conta que deseja transferir o dinheiro");
                    int contaT = in.nextInt();
                    System.out.println("Digite o valor");
                    double vT = in.nextDouble();
                    b.transferir(contaT,vT);
                    intro.add(b); break;
                case 4:break;
                case 5:break;
             }
        }
    }
    
}
