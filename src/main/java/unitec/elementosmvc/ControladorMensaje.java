
package unitec.elementosmvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") //Aplication Package interface
@CrossOrigin
public class ControladorMensaje {
    @Autowired RepositorioMensaje repoMensaje;
    //INCISO A:: BUSCAR TODOS
    @GetMapping("/mensaje")
    public List<Mensaje> buscarTodos(){
        return  repoMensaje.findAll();
    }
    //CASO B: BUSCAR POR ID
    
    @GetMapping("/mensaje/{id}") //conocido como variable de ruta
    public Mensaje buscarporId(@PathVariable String id){
        Mensaje mensa=new Mensaje();
        mensa.setId(id);
        return repoMensaje.findById(id).get();
    }
    //Caso C: Guardar
    @PostMapping("/mensaje")
    public Estatus guardar(@RequestBody String json) throws Exception{
       //primero convertimos este String json a objeto java
       ObjectMapper maper=new ObjectMapper();
       Mensaje mensa=maper.readValue(json, Mensaje.class);
       repoMensaje.save(mensa);
       System.out.println("este objeto se convirtio "+mensa);
        Estatus estatus=new Estatus();
        estatus.setSuccess(true);
        estatus.setMensaje("Mensaje guardado con exito");
        return estatus;
    }
            
}
