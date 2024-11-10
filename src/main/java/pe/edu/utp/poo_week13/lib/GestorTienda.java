/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.poo_week13.lib;

import java.util.ArrayList;
import java.util.List;
import pe.edu.utp.poo_week13.pojo.Auto;
import pe.edu.utp.poo_week13.pojo.Cliente;
import pe.edu.utp.poo_week13.pojo.Venta;

/**
 *
 * @author manuelguarniz
 */
public class GestorTienda {
    
    public List<Cliente> clientes = new ArrayList<>();
    public List<Auto> autos = new ArrayList<>();
    public List<Venta> ventas = new ArrayList<>();
    
    private static GestorTienda instance;
    public static GestorTienda getInstance() {
        if (instance == null) {
            instance = new GestorTienda();
        }
        return instance;
    }
    
    public void registrar(Venta venta) {
        ventas.add(venta);
    }
    public void registrar(Auto auto) {
        autos.add(auto);
    }
    public void registrar(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public Cliente buscarCliente(String nombreApellido) {
        Cliente cliente = null;
        if (nombreApellido != null) {
            for (var c : clientes) {
                if (nombreApellido.equalsIgnoreCase(c.getNombre() + " " + c.getApellidos())) {
                    cliente = c;
                    break;
                }
            }
        }
        return cliente;
    }
    public Auto buscarAuto(String marcaModelo) {
        Auto auto = null;
        if (marcaModelo != null) {
            for (var a : autos) {
                if (marcaModelo.equalsIgnoreCase(a.getMarca() + " - " + a.getModelo())) {
                    auto = a;
                    break;
                }
            }
        }
        return auto;
    }

    public String mostrar() {
        StringBuilder builder = new StringBuilder();
        builder.append("**** Venta ****\n");
        int index = 0;
        for (Venta venta : ventas) {
            index++;
            builder.append("Venta Nro: ").append(index).append("\n");
            builder.append(venta.getCliente()).append("\n");
            builder.append(venta.getAuto()).append("\n");
        }
        return builder.toString();
    }
}
