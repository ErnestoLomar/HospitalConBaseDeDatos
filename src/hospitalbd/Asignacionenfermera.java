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
@Table(name = "asignacionenfermera")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Asignacionenfermera.findAll", query = "SELECT a FROM Asignacionenfermera a"),
    @NamedQuery(name = "Asignacionenfermera.findByClaveasig", query = "SELECT a FROM Asignacionenfermera a WHERE a.claveasig = :claveasig"),
    @NamedQuery(name = "Asignacionenfermera.findByNombree", query = "SELECT a FROM Asignacionenfermera a WHERE a.nombree = :nombree"),
    @NamedQuery(name = "Asignacionenfermera.findByClavee", query = "SELECT a FROM Asignacionenfermera a WHERE a.clavee = :clavee"),
    @NamedQuery(name = "Asignacionenfermera.findByNombrep", query = "SELECT a FROM Asignacionenfermera a WHERE a.nombrep = :nombrep"),
    @NamedQuery(name = "Asignacionenfermera.findByClavep", query = "SELECT a FROM Asignacionenfermera a WHERE a.clavep = :clavep")})
public class Asignacionenfermera implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CLAVEASIG")
    private Integer claveasig;
    @Basic(optional = false)
    @Column(name = "NOMBREE")
    private String nombree;
    @Basic(optional = false)
    @Column(name = "CLAVEE")
    private int clavee;
    @Basic(optional = false)
    @Column(name = "NOMBREP")
    private String nombrep;
    @Basic(optional = false)
    @Column(name = "CLAVEP")
    private int clavep;

    public Asignacionenfermera() {
    }

    public Asignacionenfermera(Integer claveasig) {
        this.claveasig = claveasig;
    }

    public Asignacionenfermera(Integer claveasig, String nombree, int clavee, String nombrep, int clavep) {
        this.claveasig = claveasig;
        this.nombree = nombree;
        this.clavee = clavee;
        this.nombrep = nombrep;
        this.clavep = clavep;
    }

    public Integer getClaveasig() {
        return claveasig;
    }

    public void setClaveasig(Integer claveasig) {
        this.claveasig = claveasig;
    }

    public String getNombree() {
        return nombree;
    }

    public void setNombree(String nombree) {
        this.nombree = nombree;
    }

    public int getClavee() {
        return clavee;
    }

    public void setClavee(int clavee) {
        this.clavee = clavee;
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
        if (!(object instanceof Asignacionenfermera)) {
            return false;
        }
        Asignacionenfermera other = (Asignacionenfermera) object;
        if ((this.claveasig == null && other.claveasig != null) || (this.claveasig != null && !this.claveasig.equals(other.claveasig))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hospitalbd.Asignacionenfermera[ claveasig=" + claveasig + " ]";
    }
    
}
