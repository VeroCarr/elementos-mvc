/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.elementosmvc;

import org.springframework.context.annotation.Configuration;

/**
 *
 * @author T-107
 */
//
@Configuration
public class ServicioTarjeta {
    Tarjeta222 obtenerSaldo(){
        return new Debito();
    }
}
