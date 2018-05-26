package unitec.elementosmvc;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElementosMvcApplication implements CommandLineRunner {
    @Autowired ServicioTarjeta servicee;//Atributo
    @Autowired RepositorioMensaje repMessage;
	public static void main(String[] args) {
		SpringApplication.run(ElementosMvcApplication.class, args);
                
	}

    @Override
    public void run(String... args) throws Exception {
                servicee.obtenerSaldo().obtenerSaldo();
                        //servicio      Tarjeta
                LocalDate fecha=LocalDate.now();
                repMessage.save(new Mensaje(fecha,"Mi primer mensaje"));
    }
}


