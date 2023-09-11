

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa1;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Familia
 */
public class  Empresa implements Comparable<Empleado>{
    private String razonSocial;
    private int cuit;
    private ArrayList <Empleado> empleados;

    public Empresa(String razonSocial, int cuit) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.empleados =  new ArrayList<>();
    }

    public Empresa() {
    }
    

    public String getRazonSocial() {
        return razonSocial;
    }

    public int getCuit() {
        return cuit;
    }
    public void agregarEmpleado(Empleado e){
    this.empleados.add(e);
    
    }
     public void mostrarEmpleado(){
       for (int i=0;i<empleados.size();i++) {
      
      System.out.println(empleados.get(i));
    }
 
 }

    @Override
    public String toString() {
        return  razonSocial ;
    }

    

    

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        return Objects.equals(this.razonSocial, other.razonSocial);
    }
     
    
    
}