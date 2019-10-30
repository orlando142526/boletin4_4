
package boletin4_4;

public class Cuenta {
     private String nome, numeroConta;private double interese, saldo;
    public Cuenta (){}
    public Cuenta (String nom, String numC, double inter, double dineros){nome=nom;numeroConta=numC;interese=inter;saldo=dineros;}
    public void setNome(String nom){nome = nom;}
    public void setNumero(String numC)     {numeroConta=numC;}  
    public void setInterese(double inter){interese=inter;}
    public void setDinero(double dineros){saldo=dineros;}
    public String getNome (){return nome;}
    public String getNumero(){return numeroConta;}   
    public double getInterese(){return interese;}       
    public double getDinero(){return saldo;}
    public void ingresar (double ingreso){saldo=saldo+ingreso;}
    public void reintegrar (double reintegro){if (0<saldo){saldo=saldo - reintegro;}
                                              else{System.out.println("no tienes suficiente dinero para retirar");}}
    public void transferir (Cuenta cuenta2,double cantidad){this.saldo=saldo-cantidad;
cuenta2.ingresar(cantidad);}}