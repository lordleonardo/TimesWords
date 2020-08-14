/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.timewords.facade;

import co.com.timewords.entity.Resultadohoraminuto;
import co.com.timewords.facade.local.ResultadoHoraMinutoFacadeLocal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Esta clase le envía el tipo de entidad en este caso Resultadohoraminuto a la
 * clase abstracta AbstractFacade para realizar el tipo de persistencia luego
 * implementa los métodos generales a través de la interface
 * ResultadoHoraMinutoFacadeLocal
 *
 * @author Leo Montes
 */
@Stateless
public class ResultadoHoraMinutoFacade extends AbstractFacade<Resultadohoraminuto> implements ResultadoHoraMinutoFacadeLocal {

    @PersistenceContext(unitName = "TimesWordsPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ResultadoHoraMinutoFacade() {
        super(Resultadohoraminuto.class);
    }

    /**
     * Se implementa el método específico definido en la interface
     * ResultadoHoraMinutoFacadeLocal, obteniendo una consulta JPQL desde la
     * entidad Resultadohoraminuto trayendo el valor del conteo para asi sumarle
     * una unidad
     * @return conteo de la tabla más un valor
     */
    @Override
    public int count() {
        int count = ((Number) em.createNamedQuery("Resultadohoraminuto.findAllCount").getSingleResult()).intValue();
        return count + 1;
    }

}
