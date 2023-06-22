/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 * @author Brigitte Vanesa Chavez Riascos-2041700
 */
public class modeloPaciente {
    private String id;
    private String nombre;
    private String apellidos;
    private String tel;
    private String dir;
    
    //constructor
    public modeloPaciente (){
        
    }

    public modeloPaciente(String id, String nombre, String apellidos, String tel, String dir) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tel = tel;
        this.dir = dir;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }
    
    
    
}
