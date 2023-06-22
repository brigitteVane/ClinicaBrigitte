/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Brigitte Vanesa Chavez Riascos-2041700
 */
public class modeloPacienteAlergias {
    private String idPaciente;
    private int idAlergia;
    
    
    public modeloPacienteAlergias(){
        
    }

    public modeloPacienteAlergias(String idPaciente, int idAlergia) {
        this.idPaciente = idPaciente;
        this.idAlergia = idAlergia;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdAlergia() {
        return idAlergia;
    }

    public void setIdAlergia(int idAlergia) {
        this.idAlergia = idAlergia;
    }
    
    
    
}
