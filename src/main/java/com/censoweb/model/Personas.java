/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author luisg
 */
@Entity
@Table(name = "personas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personas.findAll", query = "SELECT p FROM Personas p")
    , @NamedQuery(name = "Personas.findByIdPersona", query = "SELECT p FROM Personas p WHERE p.idPersona = :idPersona")
    , @NamedQuery(name = "Personas.findByNombre1", query = "SELECT p FROM Personas p WHERE p.nombre1 = :nombre1")
    , @NamedQuery(name = "Personas.findByNombre2", query = "SELECT p FROM Personas p WHERE p.nombre2 = :nombre2")
    , @NamedQuery(name = "Personas.findByApellido1", query = "SELECT p FROM Personas p WHERE p.apellido1 = :apellido1")
    , @NamedQuery(name = "Personas.findByApellido2", query = "SELECT p FROM Personas p WHERE p.apellido2 = :apellido2")
    , @NamedQuery(name = "Personas.findByIdentificacion", query = "SELECT p FROM Personas p WHERE p.identificacion = :identificacion")
    , @NamedQuery(name = "Personas.findByGenero", query = "SELECT p FROM Personas p WHERE p.genero = :genero")
    , @NamedQuery(name = "Personas.findByTelefono", query = "SELECT p FROM Personas p WHERE p.telefono = :telefono")
    , @NamedQuery(name = "Personas.findByFechaNacimiento", query = "SELECT p FROM Personas p WHERE p.fechaNacimiento = :fechaNacimiento")
    , @NamedQuery(name = "Personas.findByEstado", query = "SELECT p FROM Personas p WHERE p.estado = :estado")
    , @NamedQuery(name = "Personas.findByRegimenSalud", query = "SELECT p FROM Personas p WHERE p.regimenSalud = :regimenSalud")
    , @NamedQuery(name = "Personas.findByEstadoProceso", query = "SELECT p FROM Personas p WHERE p.estadoProceso = :estadoProceso")
    , @NamedQuery(name = "Personas.findByCabezaFamilia", query = "SELECT p FROM Personas p WHERE p.cabezaFamilia = :cabezaFamilia")})
public class Personas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_persona")
    private Integer idPersona;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "nombre_1")
    private String nombre1;
    @Size(max = 25)
    @Column(name = "nombre_2")
    private String nombre2;
    @Size(max = 25)
    @Column(name = "apellido_1")
    private String apellido1;
    @Size(max = 25)
    @Column(name = "apellido_2")
    private String apellido2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "identificacion")
    private String identificacion;
    @Column(name = "genero")
    private Character genero;
    @Size(max = 15)
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Column(name = "estado")
    private Character estado;
    @Column(name = "regimen_salud")
    private Character regimenSalud;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estadoProceso")
    private Character estadoProceso;
    @Column(name = "cabezaFamilia")
    private Character cabezaFamilia;
    @JoinColumn(name = "id_afiliacion_salud", referencedColumnName = "id_afiliacionSalud")
    @ManyToOne(optional = false)
    private Afiliacionessalud idAfiliacionSalud;
    @JoinColumn(name = "id_discapacidad", referencedColumnName = "id_Discapacidad")
    @ManyToOne(optional = false)
    private Discapacidad idDiscapacidad;
    @JoinColumn(name = "id_estadoCivil", referencedColumnName = "id_estadoCivil")
    @ManyToOne(optional = false)
    private Estadosciviles idestadoCivil;
    @JoinColumn(name = "id_ficha_familiar", referencedColumnName = "id_fichaFamiliar")
    @ManyToOne(optional = false)
    private Fichasfamiliares idFichaFamiliar;
    @JoinColumn(name = "id_nivelEducativo", referencedColumnName = "id_nivelEducativo")
    @ManyToOne(optional = false)
    private Niveleducativo idnivelEducativo;
    @JoinColumn(name = "id_ocupacion", referencedColumnName = "id_ocupacion")
    @ManyToOne(optional = false)
    private Ocupaciones idOcupacion;
    @JoinColumn(name = "id_parentesco", referencedColumnName = "id_parentesco")
    @ManyToOne
    private Parentescos idParentesco;
    @JoinColumn(name = "id_procesoJudicial", referencedColumnName = "id_procesoJudicial")
    @ManyToOne
    private Procesosjudiciales idprocesoJudicial;
    @JoinColumn(name = "id_tipoDoc", referencedColumnName = "id_tipoDoc")
    @ManyToOne(optional = false)
    private Tiposdocumento idtipoDoc;

    public Personas() {
    }

    public Personas(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public Personas(Integer idPersona, String nombre1, String identificacion, Character estadoProceso) {
        this.idPersona = idPersona;
        this.nombre1 = nombre1;
        this.identificacion = identificacion;
        this.estadoProceso = estadoProceso;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Character getGenero() {
        return genero;
    }

    public void setGenero(Character genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public Character getRegimenSalud() {
        return regimenSalud;
    }

    public void setRegimenSalud(Character regimenSalud) {
        this.regimenSalud = regimenSalud;
    }

    public Character getEstadoProceso() {
        return estadoProceso;
    }

    public void setEstadoProceso(Character estadoProceso) {
        this.estadoProceso = estadoProceso;
    }

    public Character getCabezaFamilia() {
        return cabezaFamilia;
    }

    public void setCabezaFamilia(Character cabezaFamilia) {
        this.cabezaFamilia = cabezaFamilia;
    }

    public Afiliacionessalud getIdAfiliacionSalud() {
        return idAfiliacionSalud;
    }

    public void setIdAfiliacionSalud(Afiliacionessalud idAfiliacionSalud) {
        this.idAfiliacionSalud = idAfiliacionSalud;
    }

    public Discapacidad getIdDiscapacidad() {
        return idDiscapacidad;
    }

    public void setIdDiscapacidad(Discapacidad idDiscapacidad) {
        this.idDiscapacidad = idDiscapacidad;
    }

    public Estadosciviles getIdestadoCivil() {
        return idestadoCivil;
    }

    public void setIdestadoCivil(Estadosciviles idestadoCivil) {
        this.idestadoCivil = idestadoCivil;
    }

    public Fichasfamiliares getIdFichaFamiliar() {
        return idFichaFamiliar;
    }

    public void setIdFichaFamiliar(Fichasfamiliares idFichaFamiliar) {
        this.idFichaFamiliar = idFichaFamiliar;
    }

    public Niveleducativo getIdnivelEducativo() {
        return idnivelEducativo;
    }

    public void setIdnivelEducativo(Niveleducativo idnivelEducativo) {
        this.idnivelEducativo = idnivelEducativo;
    }

    public Ocupaciones getIdOcupacion() {
        return idOcupacion;
    }

    public void setIdOcupacion(Ocupaciones idOcupacion) {
        this.idOcupacion = idOcupacion;
    }

    public Parentescos getIdParentesco() {
        return idParentesco;
    }

    public void setIdParentesco(Parentescos idParentesco) {
        this.idParentesco = idParentesco;
    }

    public Procesosjudiciales getIdprocesoJudicial() {
        return idprocesoJudicial;
    }

    public void setIdprocesoJudicial(Procesosjudiciales idprocesoJudicial) {
        this.idprocesoJudicial = idprocesoJudicial;
    }

    public Tiposdocumento getIdtipoDoc() {
        return idtipoDoc;
    }

    public void setIdtipoDoc(Tiposdocumento idtipoDoc) {
        this.idtipoDoc = idtipoDoc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPersona != null ? idPersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personas)) {
            return false;
        }
        Personas other = (Personas) object;
        if ((this.idPersona == null && other.idPersona != null) || (this.idPersona != null && !this.idPersona.equals(other.idPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Personas[ idPersona=" + idPersona + " ]";
    }
    
}
