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
public class CuentaDeCheques extends cuentaBasica{
     private int chequesEmitidos;
     private int chequesRebotados;

      
        public CuentaDeCheques( int numeroDeCuenta, String cliente){
               super (numeroDeCuenta,cliente);
          this.chequesEmitidos= 0;
       this.chequesRebotados=0; 
      
   }

     
      public boolean retirar(int cantidad) {
     
      boolean seRealisoRetiro = super.retirar(cantidad );
      if(seRealisoRetiro){
          
          this.chequesEmitidos++;
      }
      else
      {
          this.chequesRebotados++;
      }
      return seRealisoRetiro;
          
   }
      public double comisionPorChequesEmitidos(){
          double comision= (this.chequesEmitidos - 5)*10.0;
           return comision;       
      }
      public double comisionPorChequesRebotados(){
           double comision= this.chequesRebotados *200.0;
           return comision; 
      }
     public void realizarCorteMensual(){
         if(this.chequesEmitidos <= 5 ){
             double comisionEmitidos = this.chequesEmitidos;
         super.retirar(comisionEmitidos);
         }
         else{
          double comisionRebotados = this.chequesRebotados;
         super.retirar(comisionRebotados);   
         }
        
     }
}

