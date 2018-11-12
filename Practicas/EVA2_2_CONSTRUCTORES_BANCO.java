/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Fernando Martínez Santillano #18550371
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco bMiCuenta = new Banco();
        System.out.println("Nombre del cliente: " +bMiCuenta.getNombreCliente());
        System.out.println("Saldo del cliente: " +bMiCuenta.getSaldo());
        
        Banco bMiCuenta2 = new Banco("Mario Calzadillas", 75000);
        System.out.println("Nombre del cliente: " + bMiCuenta2.getNombreCliente());
        System.out.println("Saldo del cliente: " + bMiCuenta2.getSaldo());
    }
    
}
class Banco{
    private String NombreCliente;
    private double Saldo;

    public Banco() {//Constructores
        NombreCliente = "Luis Fernando Martínez Santillano";
        Saldo = 10000;
    }

    public Banco(String NombreCliente, double Saldo) {
        this.NombreCliente = NombreCliente;
        this.Saldo = Saldo;
    }
    
    

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
    
}