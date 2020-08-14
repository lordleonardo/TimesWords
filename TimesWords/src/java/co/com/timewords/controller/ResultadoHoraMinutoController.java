/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.timewords.controller;

import co.com.timewords.entity.Horapalabra;
import co.com.timewords.entity.Minutopalabra;
import co.com.timewords.entity.Resultadohoraminuto;
import co.com.timewords.facade.local.HoraPalabraFacadeLocal;
import co.com.timewords.facade.local.MinutoPalabraFacadeLocal;
import co.com.timewords.facade.local.ResultadoHoraMinutoFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * Clase controller, es la que me conecta con la vista es
 * decir los archivos JSF del proyecto, además contiene toda la lógica de
 * negocio y las conexiones a las clases de persistencia
 * @author Leo Montes
 */
@ManagedBean
@SessionScoped
public class ResultadoHoraMinutoController implements Serializable {

    @EJB
    private HoraPalabraFacadeLocal ejbFacadeHora;
    private String horapalabra;
    private List<Horapalabra> listaHorapalabra = null;

    @EJB
    private MinutoPalabraFacadeLocal ejbFacadeMinuto;
    private String minutopalabra;
    private List<Minutopalabra> listaMinutopalabra = null;

    @EJB
    ResultadoHoraMinutoFacadeLocal ejbFacadeResultado;
    private Resultadohoraminuto resultadohoraminuto;
    private Resultadohoraminuto resultadohoraminutog;
    private List<Resultadohoraminuto> listaResultadohoraminuto = null;

    @PostConstruct
    public void init() {
        resultadohoraminuto = new Resultadohoraminuto();
        resultadohoraminutog = new Resultadohoraminuto();
    }

    public ResultadoHoraMinutoController() {

    }

    /**
     * Encapsulo cada uno de los atributos creados en la clase
     *
     * @return los atrbutos de cada uno
     */
    public Resultadohoraminuto getResultadohoraminuto() {
        return resultadohoraminuto;
    }

    public void setResultadohoraminuto(Resultadohoraminuto resultadohoraminuto) {
        this.resultadohoraminuto = resultadohoraminuto;
    }

    public Resultadohoraminuto getResultadohoraminutog() {
        return resultadohoraminutog;
    }

    public void setResultadohoraminutog(Resultadohoraminuto resultadohoraminutog) {
        this.resultadohoraminutog = resultadohoraminutog;
    }

    /**
     * Obtengo de la tabla horapalabra todos los registros almacenados en base
     * de datos, desde el ejbFacadeHora.findAll(). En la lista listaHorapalabra
     * almaceno estos registros obtenidos.
     *
     * @return la lista con los registros obtenidos de la base datos
     */
    public List<Horapalabra> getListaHorapalabra() {
        if (listaHorapalabra == null) {
            listaHorapalabra = ejbFacadeHora.findAll();
        }
        return listaHorapalabra;
    }

    public String getMinutopalabra() {
        return minutopalabra;
    }

    public void setMinutopalabra(String minutopalabra) {
        this.minutopalabra = minutopalabra;
    }

    public String getHorapalabra() {
        return horapalabra;
    }

    public void setHorapalabra(String horapalabra) {
        this.horapalabra = horapalabra;
    }

    /**
     * Obtengo de la tabla minutopalabra todos los registros almacenados en base
     * de datos, desde el ejbFacadeMinuto.findAll(). En la lista
     * listaMinutopalabra almaceno estos registros obtenidos.
     *
     * @return la lista con los registros obtenidos de la base datos
     */
    public List<Minutopalabra> getListaMinutopalabra() {
        if (listaMinutopalabra == null) {
            listaMinutopalabra = ejbFacadeMinuto.findAll();
        }
        return listaMinutopalabra;
    }

    /**
     * Obtengo de la tabla resultadohoraminuto todos los registros almacenados
     * en base de datos, desde el ejbFacadeResultado.findAll(). En la lista
     * listaResultadohoraminuto almaceno estos registros obtenidos.
     *
     * @return la lista con los registros obtenidos de la base datos
     */
    public List<Resultadohoraminuto> getListaResultadohoraminuto() {
        if (listaResultadohoraminuto == null) {
            listaResultadohoraminuto = ejbFacadeResultado.findAll();
        }
        return listaResultadohoraminuto;
    }

    public void setListaResultadohoraminuto(List<Resultadohoraminuto> listaResultadohoraminuto) {
        this.listaResultadohoraminuto = listaResultadohoraminuto;
    }

    /**
     * Del formulario obtengo la hora y el minuto, luego recorro la lista
     * listaHorapalabra, para asi compararla con la del usuario,asi mismo este
     * registro encontrado se almacena en el atributo resultado. Este mismo
     * proceso se realiza con la lista listaMinutopalabra. Al final lo que se
     * almacena en el atributo resultado se pasa al objeto resultadohoraminutog
     * y y en cada uno de estos atributos sus respectivas variables,hora,minuto.
     * Para el ID se realiza un método que genera el conteo de la tabla
     * Resultadohoraminuto y se le suma uno. Luego se almacena el objeto
     * resultadohoraminutog, se carga de nuevo la lista
     * listaResultadohoraminuto, para asi ver reflejado los registros en la
     * tabla. Se finaliza mostrando un mensaje de los datos almacenados con
     * éxito
     */
    public void mostrarHora() {
        int hora = Integer.parseInt(horapalabra);
        int minuto = Integer.parseInt(minutopalabra);
        String resultado = "";

        for (Horapalabra listaHorapalabra1 : listaHorapalabra) {
            if (listaHorapalabra1.getIdhorapalabra() == hora) {
                resultado += listaHorapalabra1.getNombrehorapalabra() + " y ";
            }
        }
        for (Minutopalabra listaMinutopalabra1 : listaMinutopalabra) {
            if (listaMinutopalabra1.getIdminutopalabra() == minuto) {
                resultado += " " + listaMinutopalabra1.getNombreminutopalabra();
            }
        }
        resultadohoraminutog.setResultadohoraminuto(resultado);
        resultadohoraminutog.setIdresultadohoraminuto(ejbFacadeResultado.count());
        resultadohoraminutog.setHora(hora);
        resultadohoraminutog.setMinuto(minuto);
        ejbFacadeResultado.create(resultadohoraminutog);
        listaResultadohoraminuto = ejbFacadeResultado.findAll();
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Información", "Los datos se almacenaron con éxito"));

    }
}
