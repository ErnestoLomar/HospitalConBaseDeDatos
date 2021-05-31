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
@Table(name = "enfermera")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Enfermera.findAll", query = "SELECT e FROM Enfermera e"),
    @NamedQuery(name = "Enfermera.findByClave", query = "SELECT e FROM Enfermera e WHERE e.clave = :clave"),
    @NamedQuery(name = "Enfermera.findByNombre", query = "SELECT e FROM Enfermera e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Enfermera.findByAppaterno", query = "SELECT e FROM Enfermera e WHERE e.appaterno = :appaterno"),
    @NamedQuery(name = "Enfermera.findByApmaterno", query = "SELECT e FROM Enfermera e WHERE e.apmaterno = :apmaterno"),
    @NamedQuery(name = "Enfermera.findByTurno", query = "SELECT e FROM Enfermera e WHERE e.turno = :turno")})
public class Enfermera implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CLAVE")
    private Integer clave;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "APPATERNO")
    private String appaterno;
    @Basic(optional = false)
    @Column(name = "APMATERNO")
    private String apmaterno;
    @Basic(optional = false)
    @Column(name = "TURNO")
    private String turno;

    public Enfermera() {
    }

    public Enfermera(Integer clave) {
        this.clave = clave;
    }

    public Enfermera(Integer clave, String nombre, String appaterno, String apmaterno, String turno) {
        this.clave = clave;
        this.nombre = nombre;
        this.appaterno = appaterno;
        this.apmaterno = apmaterno;
        this.turno = turno;
    }

    public Integer getClave() {
        return clave;
    }

    public void setClave(Integer clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppaterno() {
        return appaterno;
    }

    public void setAppaterno(String appaterno) {
        this.appaterno = appaterno;
    }

    public String getApmaterno() {
        return apmaterno;
    }

    public void setApmaterno(String apmaterno) {
        this.apmaterno = apmaterno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clave != null ? clave.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Enfermera)) {
            return false;
        }
        Enfermera other = (Enfermera) object;
        if ((this.clave == null && other.clave != null) || (this.clave != null && !this.clave.equals(other.clave))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hospitalbd.Enfermera[ clave=" + clave + " ]";
    }
    
}
