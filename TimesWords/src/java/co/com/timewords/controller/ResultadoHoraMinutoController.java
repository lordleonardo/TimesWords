/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.timewords.controller;

import co.com.timewords.entity.Horapalabra;
import co.com.timewords.entity.Minutopalabra;
import co.com.timewords.entity.Resultadohoraminuto;
import co.com.timewords.facade.HoraPalabraFacade;
import co.com.timewords.facade.MinutoPalabraFacade;
import co.com.timewords.facade.ResultadoHoraMinutoFacade;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Leo Montes
 */
@ManagedBean
@SessionScoped
public class ResultadoHoraMinutoController implements Serializable {

    @EJB
    ResultadoHoraMinutoFacade ejbFacade;
    private Resultadohoraminuto resultadohoraminuto;

    @EJB
    HoraPalabraFacade ejbFacadeHora;
    private Horapalabra horapalabra;

    @EJB
    MinutoPalabraFacade ejbFacadeMinuto;
    private Minutopalabra minutopalabra;

}
