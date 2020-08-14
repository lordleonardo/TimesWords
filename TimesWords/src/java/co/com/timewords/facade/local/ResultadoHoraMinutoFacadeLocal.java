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
 * Esta clase define los métodos generales y específicos necesarios para
 * utilizar en el controller, en este utiliza la lista, el crear y el conteo de
 * la tabla de resultadohoraminuto
 *
 * @author Leo Montes
 */
@Local
public interface ResultadoHoraMinutoFacadeLocal {

    void create(Resultadohoraminuto resultadohoraminuto);

    List<Resultadohoraminuto> findAll();

    int count();

}
