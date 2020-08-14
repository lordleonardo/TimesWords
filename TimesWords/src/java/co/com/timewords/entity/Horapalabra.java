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
@Table(name = "horapalabra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Horapalabra.findAll", query = "SELECT h FROM Horapalabra h"),
    @NamedQuery(name = "Horapalabra.findByIdhorapalabra", query = "SELECT h FROM Horapalabra h WHERE h.idhorapalabra = :idhorapalabra"),
    @NamedQuery(name = "Horapalabra.findByNombrehorapalabra", query = "SELECT h FROM Horapalabra h WHERE h.nombrehorapalabra = :nombrehorapalabra")})
public class Horapalabra implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idhorapalabra")
    private Integer idhorapalabra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombrehorapalabra")
    private String nombrehorapalabra;

    public Horapalabra() {
    }

    public Horapalabra(Integer idhorapalabra) {
        this.idhorapalabra = idhorapalabra;
    }

    public Horapalabra(Integer idhorapalabra, String nombrehorapalabra) {
        this.idhorapalabra = idhorapalabra;
        this.nombrehorapalabra = nombrehorapalabra;
    }

    public Integer getIdhorapalabra() {
        return idhorapalabra;
    }

    public void setIdhorapalabra(Integer idhorapalabra) {
        this.idhorapalabra = idhorapalabra;
    }

    public String getNombrehorapalabra() {
        return nombrehorapalabra;
    }

    public void setNombrehorapalabra(String nombrehorapalabra) {
        this.nombrehorapalabra = nombrehorapalabra;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idhorapalabra != null ? idhorapalabra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Horapalabra)) {
            return false;
        }
        Horapalabra other = (Horapalabra) object;
        if ((this.idhorapalabra == null && other.idhorapalabra != null) || (this.idhorapalabra != null && !this.idhorapalabra.equals(other.idhorapalabra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.timewords.entity.Horapalabra[ idhorapalabra=" + idhorapalabra + " ]";
    }
    
}
