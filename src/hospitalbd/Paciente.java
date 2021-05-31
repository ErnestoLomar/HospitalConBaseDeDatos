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
@Table(name = "paciente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paciente.findAll", query = "SELECT p FROM Paciente p"),
    @NamedQuery(name = "Paciente.findByClave", query = "SELECT p FROM Paciente p WHERE p.clave = :clave"),
    @NamedQuery(name = "Paciente.findByNombre", query = "SELECT p FROM Paciente p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Paciente.findByAppaterno", query = "SELECT p FROM Paciente p WHERE p.appaterno = :appaterno"),
    @NamedQuery(name = "Paciente.findByApmaterno", query = "SELECT p FROM Paciente p WHERE p.apmaterno = :apmaterno"),
    @NamedQuery(name = "Paciente.findByEnfermedad", query = "SELECT p FROM Paciente p WHERE p.enfermedad = :enfermedad"),
    @NamedQuery(name = "Paciente.findByMedicamento", query = "SELECT p FROM Paciente p WHERE p.medicamento = :medicamento")})
public class Paciente implements Serializable {

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
    @Column(name = "ENFERMEDAD")
    private String enfermedad;
    @Basic(optional = false)
    @Column(name = "MEDICAMENTO")
    private String medicamento;

    public Paciente() {
    }

    public Paciente(Integer clave) {
        this.clave = clave;
    }

    public Paciente(Integer clave, String nombre, String appaterno, String apmaterno, String enfermedad, String medicamento) {
        this.clave = clave;
        this.nombre = nombre;
        this.appaterno = appaterno;
        this.apmaterno = apmaterno;
        this.enfermedad = enfermedad;
        this.medicamento = medicamento;
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

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
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
        if (!(object instanceof Paciente)) {
            return false;
        }
        Paciente other = (Paciente) object;
        if ((this.clave == null && other.clave != null) || (this.clave != null && !this.clave.equals(other.clave))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hospitalbd.Paciente[ clave=" + clave + " ]";
    }
    
}
