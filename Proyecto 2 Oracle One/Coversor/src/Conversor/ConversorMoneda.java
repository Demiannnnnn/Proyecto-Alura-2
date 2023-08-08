
package Conversor;

public class ConversorMoneda {
    
    
        
    public double dolar(double valor, String opcion){
        if("Peso a Dolar".equals(opcion)){
            return (valor*0.0012);
        }
        else{
            return (valor * 851.35);
        }
        
    }
    public double euro(double valor, String opcion){
        
        if("Peso a Euro".equals(opcion)){
            return valor*0.0011;
        }
        else{
            return valor*932.84;
        
        }
    }
    public double libras(double valor, String opcion){
        
        if("Peso a Libras".equals(opcion)){
            return valor*0.00092;
        }
        else{
            return valor*1084.23;
        }
      
        
    }
    public double yen(double valor, String opcion){
        if("Peso a Yen".equals(opcion)){
            return valor*0.17;
        }
        else{
            return valor*5.97;
        }
    }
    public double wonCoreano(double valor, String opcion){
        
        if("Peso a Won Coreano".equals(opcion)){
            return valor*1.54;
        }
        else{
            return valor*0.65;
        }
      
    }
    
}
