package unitec.elementosmvc;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElementosMvcApplication implements CommandLineRunner {

    @Autowired
    ServicioTarjeta servicee;//Atributo
    @Autowired
    RepositorioMensaje repoMensaje;

    public static void main(String[] args) {
        SpringApplication.run(ElementosMvcApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        //servicee.obtenerSaldo().obtenerSaldo();
        //servicio      Tarjeta
        LocalDate fecha = LocalDate.now();
        //guardar mensaje0
        //repoMensaje.save(new Mensaje("hola","cerdito",fecha));
        //buscar todos los mensajes ya
        /*for(Mensaje mensa: repoMensaje.findAll()){
                    System.out.println(mensa);
                }
        //buscar un mensaje por su id 
        
        System.out.println(repoMensaje.findByCuerpo("cerdito"));
        
        //Actualizar un mensaje (save) 
        */
        //borrar
        //Mensaje m=new Mensaje();
        //m.setId("5b0dfdc62d80d610bc493c2e");
        //repoMensaje.delete(m);
        
    }
}
