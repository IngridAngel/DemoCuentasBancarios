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
public class CuentaDeAhorro {
       private int numeroDeCuenta;
    private String cliente;
    private double saldo=50.00;
    private double tasadeIntereses;
    private double comisionPorSaldo;
    
 
    private static final double COMISION_POR_SALDO= 50 ;
   
    
    public CuentaDeAhorro ( int numeroDeCuenta, String cliente){
        this.numeroDeCuenta = numeroDeCuenta;
        this.cliente = cliente; 
        
    }
    
     public double getsaldo (){
         return this.saldo;
     }
 public boolean depositar(double cantidad){
       
              boolean SaldoSuperiorOIgual ;
        if (this.saldo > cantidad) {
           SaldoSuperiorOIgual = true;
        }else {
          SaldoSuperiorOIgual = false;
        }
         this.saldo =this.saldo + cantidad;
         return SaldoSuperiorOIgual;
     }
    public boolean retirar(double cantidad){
        boolean SaldoSuperiorOIgual ;
        if (this.saldo >= cantidad) {
           SaldoSuperiorOIgual = true;
           this.saldo =this.saldo - cantidad;
        }else {
          SaldoSuperiorOIgual = false;
        }
         
         return SaldoSuperiorOIgual;
        }
    public double calcularIntereses (){
           
           tasadeIntereses = (((4.00/365.00)*30.00) * this.saldo/100.00);
           
           return tasadeIntereses;
           
    } 
    
    public double calcularComisionPorSaldo(){
       
        if(this.saldo <1000 )
        {
            comisionPorSaldo = COMISION_POR_SALDO;
        }
        else{
           comisionPorSaldo = 0;
        }
        return comisionPorSaldo; 
    }
   double corte=0;
    public void realizarCorteMensual(){
   
      corte =((this.saldo + tasadeIntereses )- comisionPorSaldo) ;
     
    }
}
