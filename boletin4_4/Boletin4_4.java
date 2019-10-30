
package boletin4_4;


public class Boletin4_4 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta empresa =new Cuenta ("Martin", "234658P", 5, 250);
        System.out.println(empresa.getDinero());
        empresa.ingresar(50);
        System.out.println(empresa.getDinero());
        empresa.reintegrar(100);
        System.out.println(empresa.getDinero());
        Cuenta gonzalo =new Cuenta ("gonzalo", "932758D",10,500);
        System.out.println(gonzalo.getDinero());
        empresa.transferir(gonzalo, 100);
        System.out.println(empresa.getDinero());
System.out.println(gonzalo.getDinero());
        
        
        
    }
    
    
}
