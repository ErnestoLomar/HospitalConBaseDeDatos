/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalbd;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Pacho
 */
@Entity
@Table(name = "asignacionmedico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Asignacionmedico.findAll", query = "SELECT a FROM Asignacionmedico a"),
    @NamedQuery(name = "Asignacionmedico.findByClaveasig", query = "SELECT a FROM Asignacionmedico a WHERE a.claveasig = :claveasig"),
    @NamedQuery(name = "Asignacionmedico.findByNombrem", query = "SELECT a FROM Asignacionmedico a WHERE a.nombrem = :nombrem"),
    @NamedQuery(name = "Asignacionmedico.findByClavem", query = "SELECT a FROM Asignacionmedico a WHERE a.clavem = :clavem"),
    @NamedQuery(name = "Asignacionmedico.findByNombrep", query = "SELECT a FROM Asignacionmedico a WHERE a.nombrep = :nombrep"),
    @NamedQuery(name = "Asignacionmedico.findByClavep", query = "SELECT a FROM Asignacionmedico a WHERE a.clavep = :clavep")})
public class Asignacionmedico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CLAVEASIG")
    private Integer claveasig;
    @Basic(optional = false)
    @Column(name = "NOMBREM")
    private String nombrem;
    @Basic(optional = false)
    @Column(name = "CLAVEM")
    private int clavem;
    @Basic(optional = false)
    @Column(name = "NOMBREP")
    private String nombrep;
    @Basic(optional = false)
    @Column(name = "CLAVEP")
    private int clavep;

    public Asignacionmedico() {
    }

    public Asignacionmedico(Integer claveasig) {
        this.claveasig = claveasig;
    }

    public Asignacionmedico(Integer claveasig, String nombrem, int clavem, String nombrep, int clavep) {
        this.claveasig = claveasig;
        this.nombrem = nombrem;
        this.clavem = clavem;
        this.nombrep = nombrep;
        this.clavep = clavep;
    }

    public Integer getClaveasig() {
        return claveasig;
    }

    public void setClaveasig(Integer claveasig) {
        this.claveasig = claveasig;
    }

    public String getNombrem() {
        return nombrem;
    }

    public void setNombrem(String nombrem) {
        this.nombrem = nombrem;
    }

    public int getClavem() {
        return clavem;
    }

    public void setClavem(int clavem) {
        this.clavem = clavem;
    }

    public String getNombrep() {
        return nombrep;
    }

    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }

    public int getClavep() {
        return clavep;
    }

    public void setClavep(int clavep) {
        this.clavep = clavep;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (claveasig != null ? claveasig.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Asignacionmedico)) {
            return false;
        }
        Asignacionmedico other = (Asignacionmedico) object;
        if ((this.claveasig == null && other.claveasig != null) || (this.claveasig != null && !this.claveasig.equals(other.claveasig))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hospitalbd.Asignacionmedico[ claveasig=" + claveasig + " ]";
    }
    
}
