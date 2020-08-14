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
 *
 * @author Leo Montes
 */


@Local
public interface HoraPalabraFacadeLocal {

    void create(Horapalabra horapalabra);

    void edit(Horapalabra horapalabra);

    void remove(Horapalabra horapalabra);

    Horapalabra find(Object id);

    List<Horapalabra> findAll();

    List<Horapalabra> findRange(int[] range);

}
