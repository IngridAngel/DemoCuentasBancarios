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
public class CuentaDeAhorro extends cuentaBasica {
   
    protected double saldo;
    protected double tasadeIntereses;
    protected double comisionPorSaldo;
    
 
    private static final double COMISION_POR_SALDO= 50.00 ;
   
    
    public CuentaDeAhorro (int numeroDeCuenta, String cliente){
        super(numeroDeCuenta, cliente); 
    }
    /*
    @Override
     public double getsaldo (){
         return this.saldo;
     }
    @Override
    public boolean depositar(double cantidad){
       
              boolean SaldoSuperiorOIgual = false ;
    
         return SaldoSuperiorOIgual;
     }
    @Override
    public boolean retirar(double cantidad){
        boolean SaldoSuperiorOIgual= false;
         return SaldoSuperiorOIgual;
        }
*/
    public double calcularIntereses (){
           
           tasadeIntereses = (((4.00/365.00)*30.00) * this.getsaldo()/100.00);
           
           return tasadeIntereses;
           
    } 
    
    public double calcularComisionPorSaldo(){
       
        if(this.getsaldo() <1000 )
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
   
      corte =((this.getsaldo() + tasadeIntereses )- comisionPorSaldo) ;
     
    }
}
