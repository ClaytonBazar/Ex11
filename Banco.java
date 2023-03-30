/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package f4ex11;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Banco {
    
   
    protected String tipo;
    private float saldo;
    protected int conta;
    private boolean status=false;
    protected String dono;
     public static ArrayList<Banco> intro =new ArrayList<Banco>();
     
    public Banco(String dono, String tipo, int conta){
        this.tipo = tipo;
        this.conta = conta;
        this.dono=dono;
    }
    public void transferir(int cont, double valor){
        if(cont==this.saldo){   
           this.saldo-=valor;
            System.out.println("Valor transferido com sucesso");
        }    
      
           
       
        

                
    }  

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t.equalsIgnoreCase("CC")){
           this.setSaldo(50); 
        }else if(t.equalsIgnoreCase("CP")){
            this.setSaldo(150);
        }
        
    }
    public void fecharConta(){
        if(this.getSaldo()>0){
            System.out.println("A conta nao pode ser fechada porque ainda existe um saldo disponivel");
        }else if(this.getSaldo()<0){
            System.out.println("Nao pode fechar a conta ainda com dividas");  
        }else{
          this.setStatus(false);
        }
    }
    
    
    
    
    public double sacar(double valor) {
        if(this.status==true){
      double novoSaldo= this.saldo-(valor);
      return novoSaldo;
            }
        return 0;
         }

    
    public double depositar(double valor) {
        if(this.status==true){
     double novoSaldo= this.saldo+(valor);
     return novoSaldo;
        }
        return 0;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public static ArrayList<Banco> getIntro() {
        return intro;
    }

    public static void setIntro(ArrayList<Banco> intro) {
        Banco.intro = intro;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
