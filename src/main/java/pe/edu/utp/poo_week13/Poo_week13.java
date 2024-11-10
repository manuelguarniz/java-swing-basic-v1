/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pe.edu.utp.poo_week13;

import java.time.LocalDate;
import java.time.Month;
import pe.edu.utp.poo_week13.pojo.Auto;
import pe.edu.utp.poo_week13.pojo.Cliente;
import pe.edu.utp.poo_week13.pojo.Venta;

/**
 *
 * @author manuelguarniz
 */
public class Poo_week13 {

    public static void main(String[] args) {
        Auto auto = new Auto("Corolla", "Toyota", 22000.0);
        Auto auto1 = new Auto("Onix", "Chevrolet", 15000.0);
        Cliente cliente = new Cliente("Manuel", "Guarniz", 29, LocalDate.of(1995, Month.MARCH, 8));
        
        Venta venta = new Venta(auto, cliente);
        Venta venta2 = new Venta(auto1, cliente);
        venta.registrar(venta);
        venta.registrar(venta2);
        System.out.println(venta.mostrar());
    }
}
