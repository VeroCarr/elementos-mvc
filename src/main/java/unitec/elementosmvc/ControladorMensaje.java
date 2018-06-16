
package unitec.elementosmvc;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
}
