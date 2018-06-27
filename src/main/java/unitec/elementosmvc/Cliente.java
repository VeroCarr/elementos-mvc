/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.elementosmvc;
import unitec.elementosmvc.Tarjeta;
import org.springframework.data.annotation.Id;
/**
 *
 * @author T-107
 */
public class Cliente {
    @Id
    private String id;
    private String nombre;
    private Tarjeta tarjeta;

    public Cliente() {
    }

    public Cliente(String id, String nombre, Tarjeta tarjeta) {
        this.id = id;
        this.nombre = nombre;
        this.tarjeta = tarjeta;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
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

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", tarjeta=" + tarjeta + '}';
    }

    
}