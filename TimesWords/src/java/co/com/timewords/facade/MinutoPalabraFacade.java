/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.timewords.facade;


import co.com.timewords.entity.Minutopalabra;
import co.com.timewords.facade.local.MinutoPalabraFacadeLocal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Esta clase le envía el tipo de entidad en este caso Minutopalabra a la clase
 * abstracta AbstractFacade para realizar el tipo de persistencia luego
 * implementa los métodos generales a través de la interface
 * MinutoPalabraFacadeLocal
 *
 * @author Leo Montes
 */
@Stateless
public class MinutoPalabraFacade extends AbstractFacade<Minutopalabra> implements MinutoPalabraFacadeLocal {

    @PersistenceContext(unitName = "TimesWordsPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MinutoPalabraFacade() {
        super(Minutopalabra.class);
    }

}
