/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democuentabancaria1;

import java.util.Scanner;
import model.CuentaDeAhorro;
import model.CuentaDeCheques;
import model.cuentaBasica;

/**
 *
 * @author jany-yin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
        
                
       cuentaBasica miCuenta = new cuentaBasica(01245,"Mar");
           System.out.println("/////////// **Cuenta Basica** //////////////: " );
           
       System.out.println("Saldo de la cuenta: " + miCuenta.getsaldo());
       miCuenta.depositar(1000.00);
       System.out.println("Deposito $1000: "); 
       System.out.println("Saldo de la cuenta: " + miCuenta.getsaldo());
       miCuenta.depositar(1500.00);
       System.out.println("Deposito $1500.00 : " ); 
       System.out.println("Saldo de la cuenta: " + miCuenta.getsaldo());
       miCuenta.retirar(200.00);
       System.out.println("Retiro $200.00    : " );
       System.out.println("Saldo de la cuenta: " + miCuenta.getsaldo()); 
       miCuenta.depositar(300.00);
      System.out.println("Deposito $300.00: " );
       System.out.println("Saldo de la cuenta: " + miCuenta.getsaldo());
             miCuenta.retirar(1000.00);
       System.out.println("Retiro $1000.00: " );
         
       System.out.println("Saldo de la cuenta: " + miCuenta.getsaldo());
       
       System.out.println("/////////// **Cuenta de Ahorro** //////////////: " );
    
    CuentaDeAhorro miAhorro= new CuentaDeAhorro(01245,"Mar");
    System.out.println("Saldo de la cuenta: " + miAhorro.getsaldo());
       System.out.println("Deposito: " +miAhorro.depositar(1000.00)); 
       System.out.println("Saldo de la cuenta: " + miAhorro.getsaldo());
       System.out.println("Deposito: " + miAhorro.depositar(1500.00)); 
       System.out.println("Saldo de la cuenta: " + miAhorro.getsaldo());
       miAhorro.retirar(200.00);
       System.out.println("Saldo de la cuenta: " + miAhorro.getsaldo());  
      System.out.println("Deposito: " + miAhorro.depositar(300.00));
      System.out.println("Saldo de la cuenta: " + miAhorro.getsaldo());
       miAhorro.retirar(1000.00);
       System.out.println("Saldo de la cuenta: " + miAhorro.getsaldo());
    
    System.out.println("---------------------------------- ") ;
     System.out.println("tasa de intereses: " + miAhorro.calcularIntereses());
    System.out.println("comision: " +  miAhorro.calcularComisionPorSaldo());
     
     System.out.println("Corte: " + (( miAhorro.getsaldo() +  miAhorro.calcularIntereses())- miAhorro.calcularComisionPorSaldo()));
     
      System.out.println("Saldo: " +  miAhorro.getsaldo());
       System.out.println("---------------------------------- ") ;
       
       
       
        CuentaDeCheques misCheques = new CuentaDeCheques(1245,"Mar");
           System.out.println("/////////// **Cuenta Mis Cheques ** //////////////: " );
    
       misCheques.depositar(2000.00);
       System.out.println("Deposito $2000: "); 
       System.out.println("Saldo de la cuenta cheques: " + misCheques.getsaldo());
        misCheques.retirar(100.00);
       System.out.println("Deposito $100: "); 
       System.out.println("Saldo de la cuenta cheques: " + misCheques.getsaldo());
      misCheques.retirar(100.00); 
      
       System.out.println("Deposito $100: ");  
       System.out.println("Saldo de la cuenta cheques: " + misCheques.getsaldo());
       System.out.println("Comision: " +misCheques.comisionPorChequesRebotados());
       
    }
    
    
}
    

