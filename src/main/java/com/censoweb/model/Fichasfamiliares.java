/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author luisg
 */
@Entity
@Table(name = "fichasfamiliares")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fichasfamiliares.findAll", query = "SELECT f FROM Fichasfamiliares f")
    , @NamedQuery(name = "Fichasfamiliares.findByIdfichaFamiliar", query = "SELECT f FROM Fichasfamiliares f WHERE f.idfichaFamiliar = :idfichaFamiliar")
    , @NamedQuery(name = "Fichasfamiliares.findByDireccion", query = "SELECT f FROM Fichasfamiliares f WHERE f.direccion = :direccion")
    , @NamedQuery(name = "Fichasfamiliares.findByZona", query = "SELECT f FROM Fichasfamiliares f WHERE f.zona = :zona")
    , @NamedQuery(name = "Fichasfamiliares.findByMedidaEspacio", query = "SELECT f FROM Fichasfamiliares f WHERE f.medidaEspacio = :medidaEspacio")
    , @NamedQuery(name = "Fichasfamiliares.findByUbicacionCocina", query = "SELECT f FROM Fichasfamiliares f WHERE f.ubicacionCocina = :ubicacionCocina")
    , @NamedQuery(name = "Fichasfamiliares.findByHumo", query = "SELECT f FROM Fichasfamiliares f WHERE f.humo = :humo")})
public class Fichasfamiliares implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_fichaFamiliar")
    private Integer idfichaFamiliar;
    @Size(max = 25)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 6)
    @Column(name = "zona")
    private String zona;
    @Column(name = "medidaEspacio")
    private Short medidaEspacio;
    @Size(max = 7)
    @Column(name = "ubicacionCocina")
    private String ubicacionCocina;
    @Size(max = 2)
    @Column(name = "humo")
    private String humo;
    @JoinColumn(name = "id_actividadEconomica", referencedColumnName = "id_actividadEconomica")
    @ManyToOne(optional = false)
    private Actividadeconomica idactividadEconomica;
    @JoinColumn(name = "id_aguasservidas", referencedColumnName = "id_aguaServida")
    @ManyToOne(optional = false)
    private Aguasservidas idAguasservidas;
    @JoinColumn(name = "id_animalesVivienda", referencedColumnName = "id_animalVivienda")
    @ManyToOne(optional = false)
    private Animalesvivienda idanimalesVivienda;
    @JoinColumn(name = "id_consumoAgua", referencedColumnName = "id_consumoAgua")
    @ManyToOne(optional = false)
    private Consumoagua idconsumoAgua;
    @JoinColumn(name = "id_destinoProduccion", referencedColumnName = "id_destinoProduccion")
    @ManyToOne(optional = false)
    private Destinoproduccion iddestinoProduccion;
    @JoinColumn(name = "id_eliminaExcretas", referencedColumnName = "id_eliminarExcretas")
    @ManyToOne(optional = false)
    private Eliminarexcretas ideliminaExcretas;
    @JoinColumn(name = "id_espaciosPecuarios", referencedColumnName = "id_espacioPecuario")
    @ManyToOne(optional = false)
    private Espaciospecuarios idespaciosPecuarios;
    @JoinColumn(name = "id_ttoAgua", referencedColumnName = "id_tratamientoAgua")
    @ManyToOne(optional = false)
    private Tratamientosagua idttoAgua;
    @JoinColumn(name = "id_materialTecho", referencedColumnName = "id_materialesTecho")
    @ManyToOne(optional = false)
    private Materialestecho idmaterialTecho;
    @JoinColumn(name = "id_tipoAlumbrado", referencedColumnName = "id_tipoAlumbrado")
    @ManyToOne(optional = false)
    private Tiposalumbrado idtipoAlumbrado;
    @JoinColumn(name = "id_espaciosProductivos", referencedColumnName = "id_espacioProductivo")
    @ManyToOne(optional = false)
    private Espaciosproductivos idespaciosProductivos;
    @JoinColumn(name = "id_tipoEspacioProductivo", referencedColumnName = "id_tipoEspacioProductivo")
    @ManyToOne(optional = false)
    private Tipoespaciosproductivos idtipoEspacioProductivo;
    @JoinColumn(name = "id_manejoBasuras", referencedColumnName = "id_manejoBasura")
    @ManyToOne(optional = false)
    private Manejobasuras idmanejoBasuras;
    @JoinColumn(name = "id_vereda", referencedColumnName = "id_vereda")
    @ManyToOne
    private Veredas idVereda;
    @JoinColumn(name = "id_materialesCocinar", referencedColumnName = "id_materialCocinar")
    @ManyToOne(optional = false)
    private Materialescocinar idmaterialesCocinar;
    @JoinColumn(name = "id_vectoresVivienda", referencedColumnName = "id_vectorVivienda")
    @ManyToOne(optional = false)
    private Vectoresvivienda idvectoresVivienda;
    @JoinColumn(name = "id_materialParedes", referencedColumnName = "id_materialPared")
    @ManyToOne(optional = false)
    private Materialespared idmaterialParedes;
    @JoinColumn(name = "id_materialPisos", referencedColumnName = "id_materialPiso")
    @ManyToOne(optional = false)
    private Materialespiso idmaterialPisos;
    @JoinColumn(name = "id_riesgosVivienda", referencedColumnName = "id_riesgoVivienda")
    @ManyToOne(optional = false)
    private Riesgosvivienda idriesgosVivienda;
    @JoinColumn(name = "id_tipoVivienda", referencedColumnName = "id_tipoVivienda")
    @ManyToOne(optional = false)
    private Tiposvivienda idtipoVivienda;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFichaFamiliar")
    private Collection<Personas> personasCollection;

    public Fichasfamiliares() {
    }

    public Fichasfamiliares(Integer idfichaFamiliar) {
        this.idfichaFamiliar = idfichaFamiliar;
    }

    public Integer getIdfichaFamiliar() {
        return idfichaFamiliar;
    }

    public void setIdfichaFamiliar(Integer idfichaFamiliar) {
        this.idfichaFamiliar = idfichaFamiliar;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public Short getMedidaEspacio() {
        return medidaEspacio;
    }

    public void setMedidaEspacio(Short medidaEspacio) {
        this.medidaEspacio = medidaEspacio;
    }

    public String getUbicacionCocina() {
        return ubicacionCocina;
    }

    public void setUbicacionCocina(String ubicacionCocina) {
        this.ubicacionCocina = ubicacionCocina;
    }

    public String getHumo() {
        return humo;
    }

    public void setHumo(String humo) {
        this.humo = humo;
    }

    public Actividadeconomica getIdactividadEconomica() {
        return idactividadEconomica;
    }

    public void setIdactividadEconomica(Actividadeconomica idactividadEconomica) {
        this.idactividadEconomica = idactividadEconomica;
    }

    public Aguasservidas getIdAguasservidas() {
        return idAguasservidas;
    }

    public void setIdAguasservidas(Aguasservidas idAguasservidas) {
        this.idAguasservidas = idAguasservidas;
    }

    public Animalesvivienda getIdanimalesVivienda() {
        return idanimalesVivienda;
    }

    public void setIdanimalesVivienda(Animalesvivienda idanimalesVivienda) {
        this.idanimalesVivienda = idanimalesVivienda;
    }

    public Consumoagua getIdconsumoAgua() {
        return idconsumoAgua;
    }

    public void setIdconsumoAgua(Consumoagua idconsumoAgua) {
        this.idconsumoAgua = idconsumoAgua;
    }

    public Destinoproduccion getIddestinoProduccion() {
        return iddestinoProduccion;
    }

    public void setIddestinoProduccion(Destinoproduccion iddestinoProduccion) {
        this.iddestinoProduccion = iddestinoProduccion;
    }

    public Eliminarexcretas getIdeliminaExcretas() {
        return ideliminaExcretas;
    }

    public void setIdeliminaExcretas(Eliminarexcretas ideliminaExcretas) {
        this.ideliminaExcretas = ideliminaExcretas;
    }

    public Espaciospecuarios getIdespaciosPecuarios() {
        return idespaciosPecuarios;
    }

    public void setIdespaciosPecuarios(Espaciospecuarios idespaciosPecuarios) {
        this.idespaciosPecuarios = idespaciosPecuarios;
    }

    public Tratamientosagua getIdttoAgua() {
        return idttoAgua;
    }

    public void setIdttoAgua(Tratamientosagua idttoAgua) {
        this.idttoAgua = idttoAgua;
    }

    public Materialestecho getIdmaterialTecho() {
        return idmaterialTecho;
    }

    public void setIdmaterialTecho(Materialestecho idmaterialTecho) {
        this.idmaterialTecho = idmaterialTecho;
    }

    public Tiposalumbrado getIdtipoAlumbrado() {
        return idtipoAlumbrado;
    }

    public void setIdtipoAlumbrado(Tiposalumbrado idtipoAlumbrado) {
        this.idtipoAlumbrado = idtipoAlumbrado;
    }

    public Espaciosproductivos getIdespaciosProductivos() {
        return idespaciosProductivos;
    }

    public void setIdespaciosProductivos(Espaciosproductivos idespaciosProductivos) {
        this.idespaciosProductivos = idespaciosProductivos;
    }

    public Tipoespaciosproductivos getIdtipoEspacioProductivo() {
        return idtipoEspacioProductivo;
    }

    public void setIdtipoEspacioProductivo(Tipoespaciosproductivos idtipoEspacioProductivo) {
        this.idtipoEspacioProductivo = idtipoEspacioProductivo;
    }

    public Manejobasuras getIdmanejoBasuras() {
        return idmanejoBasuras;
    }

    public void setIdmanejoBasuras(Manejobasuras idmanejoBasuras) {
        this.idmanejoBasuras = idmanejoBasuras;
    }

    public Veredas getIdVereda() {
        return idVereda;
    }

    public void setIdVereda(Veredas idVereda) {
        this.idVereda = idVereda;
    }

    public Materialescocinar getIdmaterialesCocinar() {
        return idmaterialesCocinar;
    }

    public void setIdmaterialesCocinar(Materialescocinar idmaterialesCocinar) {
        this.idmaterialesCocinar = idmaterialesCocinar;
    }

    public Vectoresvivienda getIdvectoresVivienda() {
        return idvectoresVivienda;
    }

    public void setIdvectoresVivienda(Vectoresvivienda idvectoresVivienda) {
        this.idvectoresVivienda = idvectoresVivienda;
    }

    public Materialespared getIdmaterialParedes() {
        return idmaterialParedes;
    }

    public void setIdmaterialParedes(Materialespared idmaterialParedes) {
        this.idmaterialParedes = idmaterialParedes;
    }

    public Materialespiso getIdmaterialPisos() {
        return idmaterialPisos;
    }

    public void setIdmaterialPisos(Materialespiso idmaterialPisos) {
        this.idmaterialPisos = idmaterialPisos;
    }

    public Riesgosvivienda getIdriesgosVivienda() {
        return idriesgosVivienda;
    }

    public void setIdriesgosVivienda(Riesgosvivienda idriesgosVivienda) {
        this.idriesgosVivienda = idriesgosVivienda;
    }

    public Tiposvivienda getIdtipoVivienda() {
        return idtipoVivienda;
    }

    public void setIdtipoVivienda(Tiposvivienda idtipoVivienda) {
        this.idtipoVivienda = idtipoVivienda;
    }

    @XmlTransient
    public Collection<Personas> getPersonasCollection() {
        return personasCollection;
    }

    public void setPersonasCollection(Collection<Personas> personasCollection) {
        this.personasCollection = personasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfichaFamiliar != null ? idfichaFamiliar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fichasfamiliares)) {
            return false;
        }
        Fichasfamiliares other = (Fichasfamiliares) object;
        if ((this.idfichaFamiliar == null && other.idfichaFamiliar != null) || (this.idfichaFamiliar != null && !this.idfichaFamiliar.equals(other.idfichaFamiliar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Fichasfamiliares[ idfichaFamiliar=" + idfichaFamiliar + " ]";
    }
    
}
