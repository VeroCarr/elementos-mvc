/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.elementosmvc;

import java.time.LocalDate;
import org.springframework.data.annotation.Id;

/**
 *
 * @author T-107
 */
public class Mensaje {
    
    @Id
    private String id;
    private String cuerpo;
    
    private LocalDate fecha;

    public Mensaje(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Mensaje(String cuerpo, LocalDate fecha) {
        this.cuerpo = cuerpo;
        this.fecha = fecha;
    }
    
    

    public Mensaje() {
    }

    public Mensaje(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    Mensaje(LocalDate fecha, String mi_primer_mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


 

    public String getCuerpo() {
        return cuerpo;
    }

    
    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    
}
