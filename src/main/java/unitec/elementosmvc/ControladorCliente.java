/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.elementosmvc;

import unitec.elementosmvc.RepositorioCliente;
import unitec.elementosmvc.Cliente;
import com.fasterxml.jackson.databind.ObjectMapper;
import ejercicio.Estatus;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author T-107
 */
@RestController
@RequestMapping("/api") //Aplication Package interface
@CrossOrigin
public class ControladorCliente {
    @Autowired RepositorioCliente cli;
    @GetMapping ("/cliente")
    public List<Cliente> buscarTodos(){
        return  cli.findAll();
    }
    //CASO B: BUSCAR POR ID
    
    @GetMapping("/cliente/{id}") //conocido como variable de ruta
    public Cliente buscarporId(@PathVariable String id){
        Cliente mensa=new Cliente();
        mensa.setId(id);
        return cli.findById(id).get();
    }
    //Caso C: Guardar
    @PostMapping("/cliente")
    public Estatus guardar(@RequestBody String json) throws Exception{
       //primero convertimos este String json a objeto java
       ObjectMapper maper=new ObjectMapper();
       Cliente mensa=maper.readValue(json, Cliente.class);
       cli.save(mensa);
       System.out.println("este objeto se convirtio "+mensa);
        Estatus estatus=new Estatus();
        estatus.setSuccess(true);
        estatus.setMensaje("Mensaje guardado con exito");
        return estatus;
    }
       //Caso D: Actualizar
    @PutMapping("/cliente")
    public Estatus actualizar(@RequestBody String json) throws Exception{
       //primero convertimos este String json a objeto java
       ObjectMapper maper=new ObjectMapper();
       Cliente mensa=maper.readValue(json, Cliente.class);
       cli.save(mensa);
       System.out.println("este obclientejeto se convirtio "+mensa);
        Estatus estatus=new Estatus();
        estatus.setSuccess(true);
        estatus.setMensaje("Mensaje guardado con exito");
        return estatus;
    }
    
    //Caso E: Borrar
    @DeleteMapping("/cliente/{id}")
    public Estatus borrarPorId(@PathVariable String id){
        Cliente mensa=new Cliente();
        
        cli.deleteById(id);
        Estatus e=new Estatus();
        e.setSuccess(true);
        e.setMensaje("Mensaje borrado con exito");
        return e;
    }
}
