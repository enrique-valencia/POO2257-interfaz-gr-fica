/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.Fes.persistencia;

import java.util.ArrayList;

/**
 *
 * @author 52553
 */
public class ArchivoEmpleado {
    private String archivo;

    public ArchivoEmpleado() {
    }

    public ArchivoEmpleado(String archivo) {
        this.archivo = archivo;
    }
 {      
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
    
    public void guardarEmpleado(ArrayList<Empleado> dato){
    //awui el codigo para gravar en disco duro 
    
}

    public ArrayList<Empleado>leerEmpleados(){
        ArrayList<Empleado> tmp=null;
        
        //leer del disco duro
        // Se sube al ArrayList tmp
        
        return tmp;
    }