/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.timewords.facade.local;

;
import co.com.timewords.entity.Minutopalabra;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Leo Montes
 */


@Local
public interface MinutoPalabraFacadeLocal {

    void create(Minutopalabra minutopalabra);

    void edit(Minutopalabra minutopalabra);

    void remove(Minutopalabra minutopalabra);

    Minutopalabra find(Object id);

    List<Minutopalabra> findAll();

    List<Minutopalabra> findRange(int[] range);

}
