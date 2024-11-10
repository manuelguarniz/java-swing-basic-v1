/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.poo_week13.pojo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;
import pe.edu.utp.poo_week13.common.Util;

/**
 *
 * @author manuelguarniz
 */
public class Cliente {
    private String nombre;
    private String apellidos;
    private int edad;
    private LocalDate fechaNacimiento;

    public Cliente() {}
    public Cliente(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    public Cliente(String nombre, String apellidos, int edad, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    public String getFechaNacimientoStr() {
        return Util.dateToString(fechaNacimiento);
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = Util.toDate(fechaNacimiento);
    }


    @Override
    public String toString() {
        return "Cliente: " + nombre + " " + apellidos + " - Edad: " + edad + " - Fecha nacimiento: " + getFechaNacimientoStr();
    }
    
}
