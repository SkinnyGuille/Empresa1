/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa1;

/**
 *
 * @author Familia
 */
public class Empleado implements Comparable<Empleado>  {
    
     private int dni;
    private String nombreApellido;
    private String Categoria;
    private double sueldo;
    Empresa empresa;

    public Empleado() {
    }

    public Empleado(int dni, String nombreApellido, String Categoria, double sueldo, Empresa empresa) {
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.Categoria = Categoria;
        this.sueldo = sueldo;
        this.empresa = empresa;
    }

    public int getDni() {
        return dni;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public String getCategoria() {
        return Categoria;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    @Override
    public int compareTo(Empleado o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
