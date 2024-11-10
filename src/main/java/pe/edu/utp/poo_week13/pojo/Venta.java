/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.poo_week13.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manuelguarniz
 */
public class Venta {
    private Auto auto;
    private Cliente cliente;
    
    private List<Venta> ventas = new ArrayList<>();

    public Venta(Auto auto, Cliente cliente) {
        this.auto = auto;
        this.cliente = cliente;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }
        
    public void registrar(Venta venta) {
        ventas.add(venta);
    }
    
    public String mostrar() {
        StringBuilder builder = new StringBuilder();
        builder.append("**** Venta ****\n");
        int index = 0;
        for (Venta venta : ventas) {
            index++;
            builder.append("Venta Nro: ").append(index).append("\n");
            builder.append(venta.cliente).append("\n");
            builder.append(venta.auto).append("\n");
        }
        return builder.toString();
    }
}
