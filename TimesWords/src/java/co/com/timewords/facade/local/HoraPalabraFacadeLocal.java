/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.timewords.facade.local;

;
import co.com.timewords.entity.Horapalabra;
import java.util.List;
import javax.ejb.Local;

/**
 * Esta clase define los métodos generales y específicos necesarios para
 * utilizar en el controller, en este caso solo la lista de la tabla de
 * horapalabra
 * @author Leo Montes
 */

@Local
public interface HoraPalabraFacadeLocal {

    List<Horapalabra> findAll();

}
