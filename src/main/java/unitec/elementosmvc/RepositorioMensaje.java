/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.elementosmvc;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author T-107
 */
//interface que hereda a otra interface 

public interface RepositorioMensaje extends MongoRepository<Mensaje, String> {
    //puede haber metodos implicitamente abstractos. no puede haber logica 
    //la logica lo hace el mongoRepository
    public Mensaje findByCuerpo(String cuerpo);
    
}
