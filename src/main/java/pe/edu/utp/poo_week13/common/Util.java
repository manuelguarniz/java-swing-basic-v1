/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.poo_week13.common;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 *
 * @author manuelguarniz
 */
public class Util {
    public static String dateToString(LocalDate fecha) {
        if (fecha == null) {
            return "";
        }
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return formater.format(fecha);
    }
    
    public static LocalDate toDate(String fecha) {
        if (fecha == null || "".equals(fecha.trim())) {
            return null;
        }
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        TemporalAccessor temporalAccessor = formater.parse(fecha);
        return LocalDate.from(temporalAccessor);
    }
    
    public static Double tryParseDouble(String valor) {
        try {
            return Double.valueOf(valor);
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }
}
