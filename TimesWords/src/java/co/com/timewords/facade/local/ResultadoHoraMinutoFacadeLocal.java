/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.timewords.facade.local;

;
import co.com.timewords.entity.Resultadohoraminuto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Leo Montes
 */


@Local
public interface ResultadoHoraMinutoFacadeLocal {

    void create(Resultadohoraminuto resultadohoraminuto);

    List<Resultadohoraminuto> findAll();

    int count();

}
