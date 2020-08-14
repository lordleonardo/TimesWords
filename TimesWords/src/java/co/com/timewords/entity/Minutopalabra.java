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
 * Entidad mapeada desde la base de datos con el nombre de minutopalabra,
 * utlizando algunas consultas básica par su utilización
 *
 * @author Leo Montes
 */
@Entity
@Table(name = "minutopalabra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Minutopalabra.findAll", query = "SELECT m FROM Minutopalabra m"),
    @NamedQuery(name = "Minutopalabra.findByIdminutopalabra", query = "SELECT m FROM Minutopalabra m WHERE m.idminutopalabra = :idminutopalabra"),
    @NamedQuery(name = "Minutopalabra.findByNombreminutopalabra", query = "SELECT m FROM Minutopalabra m WHERE m.nombreminutopalabra = :nombreminutopalabra")})
public class Minutopalabra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idminutopalabra")
    private Integer idminutopalabra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombreminutopalabra")
    private String nombreminutopalabra;

    /**
     * Constructores de la clase
     */
    public Minutopalabra() {
    }

    public Minutopalabra(Integer idminutopalabra) {
        this.idminutopalabra = idminutopalabra;
    }

    public Minutopalabra(Integer idminutopalabra, String nombreminutopalabra) {
        this.idminutopalabra = idminutopalabra;
        this.nombreminutopalabra = nombreminutopalabra;
    }

    /**
     * Encapsulo cada uno de los atributos creados en la clase
     *
     * @return los atrbutos de cada uno
     */
    public Integer getIdminutopalabra() {
        return idminutopalabra;
    }

    public void setIdminutopalabra(Integer idminutopalabra) {
        this.idminutopalabra = idminutopalabra;
    }

    public String getNombreminutopalabra() {
        return nombreminutopalabra;
    }

    public void setNombreminutopalabra(String nombreminutopalabra) {
        this.nombreminutopalabra = nombreminutopalabra;
    }

    /**
     * Algunos métodos útiles de la clase object
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idminutopalabra != null ? idminutopalabra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Minutopalabra)) {
            return false;
        }
        Minutopalabra other = (Minutopalabra) object;
        if ((this.idminutopalabra == null && other.idminutopalabra != null) || (this.idminutopalabra != null && !this.idminutopalabra.equals(other.idminutopalabra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + idminutopalabra + "";
    }

}
