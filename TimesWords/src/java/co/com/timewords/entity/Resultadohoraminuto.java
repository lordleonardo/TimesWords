/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.timewords.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Leo Montes
 */
@Entity
@Table(name = "resultadohoraminuto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Resultadohoraminuto.findAll", query = "SELECT r FROM Resultadohoraminuto r"),
    @NamedQuery(name = "Resultadohoraminuto.findByIdresultadohoraminuto", query = "SELECT r FROM Resultadohoraminuto r WHERE r.idresultadohoraminuto = :idresultadohoraminuto"),
    @NamedQuery(name = "Resultadohoraminuto.findByResultadohoraminuto", query = "SELECT r FROM Resultadohoraminuto r WHERE r.resultadohoraminuto = :resultadohoraminuto")})
public class Resultadohoraminuto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idresultadohoraminuto")
    private Integer idresultadohoraminuto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "resultadohoraminuto")
    private String resultadohoraminuto;
    @Column(name = "hora")
    private Integer hora;
    @Column(name = "minuto")
    private Integer minuto;

    public Resultadohoraminuto() {
    }

    public Resultadohoraminuto(Integer idresultadohoraminuto) {
        this.idresultadohoraminuto = idresultadohoraminuto;
    }

    public Resultadohoraminuto(Integer idresultadohoraminuto, String resultadohoraminuto) {
        this.idresultadohoraminuto = idresultadohoraminuto;
        this.resultadohoraminuto = resultadohoraminuto;
    }

    public Integer getIdresultadohoraminuto() {
        return idresultadohoraminuto;
    }

    public void setIdresultadohoraminuto(Integer idresultadohoraminuto) {
        this.idresultadohoraminuto = idresultadohoraminuto;
    }

    public String getResultadohoraminuto() {
        return resultadohoraminuto;
    }

    public void setResultadohoraminuto(String resultadohoraminuto) {
        this.resultadohoraminuto = resultadohoraminuto;
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public Integer getMinuto() {
        return minuto;
    }

    public void setMinuto(Integer minuto) {
        this.minuto = minuto;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idresultadohoraminuto != null ? idresultadohoraminuto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Resultadohoraminuto)) {
            return false;
        }
        Resultadohoraminuto other = (Resultadohoraminuto) object;
        if ((this.idresultadohoraminuto == null && other.idresultadohoraminuto != null) || (this.idresultadohoraminuto != null && !this.idresultadohoraminuto.equals(other.idresultadohoraminuto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.timewords.entity.Resultadohoraminuto[ idresultadohoraminuto=" + idresultadohoraminuto + " ]";
    }

}
