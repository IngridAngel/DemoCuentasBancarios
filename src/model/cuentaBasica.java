/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jany-yin
 */
public class cuentaBasica {
    private  int numeroDeCuenta;
    private String cliente;
    private double saldo=50.00;
    
    //Constructor
    public cuentaBasica ( int numeroDeCuenta, String cliente){
        this.numeroDeCuenta = numeroDeCuenta;
        this.cliente = cliente; 
        
    }

     public double getsaldo (){
         return this.saldo;
     }

    public boolean depositar(double cantidad){
       
              boolean SaldoSuperiorOIgual ;
        if ( cantidad > 0 ) {
           SaldoSuperiorOIgual = true;
        }else {
          SaldoSuperiorOIgual = false;
        }
         this.saldo =this.saldo + cantidad;
         return SaldoSuperiorOIgual;
     }
    public boolean retirar(double cantidad){
        
        boolean seRealisoRetiro ;
        if  (  cantidad > this.saldo) {
           seRealisoRetiro = true;
           System.out.println("No puede retirar mas de lo que tiene");
           
        }else {
          seRealisoRetiro = false;
          this.saldo =this.saldo - cantidad;
        }
         
         return seRealisoRetiro;
        }
        
}
