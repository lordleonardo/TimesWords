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

}
