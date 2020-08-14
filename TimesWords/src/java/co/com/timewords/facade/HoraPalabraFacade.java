/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.timewords.facade;


import co.com.timewords.entity.Horapalabra;
import co.com.timewords.facade.local.HoraPalabraFacadeLocal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Leo Montes
 */
@Stateless
public class HoraPalabraFacade extends AbstractFacade<Horapalabra> implements HoraPalabraFacadeLocal {

    @PersistenceContext(unitName = "TimesWordsPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HoraPalabraFacade() {
        super(Horapalabra.class);
    }

}
