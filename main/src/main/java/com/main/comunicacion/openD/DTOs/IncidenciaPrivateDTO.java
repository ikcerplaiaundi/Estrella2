package com.main.comunicacion.openD.DTOs;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.main.modelo.entidades.Ciudad;
import com.main.modelo.entidades.Provincia;
import com.main.modelo.entidades.Region;
import com.main.modelo.entidades.TipoIncidencia;

import jakarta.persistence.Column;
import lombok.Data;
//DTO de incidencia de la api interna
@Data
public class IncidenciaPrivateDTO {

    private long id;
    private String latitud;
    private String longitud;
    private String causa;
    private String nivelIncidencia;
    private String carretera;

    @Column(name = "fecha_inicio")
    private Date fechaInicio;

    @JsonIgnore
    private long idCiudad;
    @JsonIgnore
    private long idRegion;
    @JsonIgnore
    private long idTipoIncidencia;

    private CiudadPrivateDTO ciudad;
    private ProvinciaPrivateDTO provincia;
    private RegionPrivateDTO region;
    private TipoIncidenciaPrivateDTO tipoIncidencia;

    public IncidenciaPrivateDTO(long id, String latitud, String longitud, String causa, String nivelIncidencia,
            String carretera, Date fechaInicio) {
        this.id = id;
        this.latitud = latitud;
        this.longitud = longitud;
        this.causa = causa;
        this.nivelIncidencia = nivelIncidencia;
        this.carretera = carretera;
        this.fechaInicio = fechaInicio;
    }

    public IncidenciaPrivateDTO(String latitud, String longitud, String causa, String nivelIncidencia,
            String carretera, Date fechaInicio) {
        this.latitud = latitud;
        this.longitud = longitud;
        this.causa = causa;
        this.nivelIncidencia = nivelIncidencia;
        this.carretera = carretera;
        this.fechaInicio = fechaInicio;
    }

    public IncidenciaPrivateDTO(long id, String latitud, String longitud, String causa, String nivelIncidencia,
            String carretera, Date fechaInicio, long idCiudad, long idRegion, long idTipoIncidencia) {
        this.id = id;
        this.latitud = latitud;
        this.longitud = longitud;
        this.causa = causa;
        this.nivelIncidencia = nivelIncidencia;
        this.carretera = carretera;
        this.fechaInicio = fechaInicio;
        this.idCiudad = idCiudad;
        this.idRegion = idRegion;
        this.idTipoIncidencia = idTipoIncidencia;
    }

    public IncidenciaPrivateDTO(long id, String latitud, String longitud, String causa, String nivelIncidencia,
            String carretera, Date fechaInicio, CiudadPrivateDTO ciudad,ProvinciaPrivateDTO provincia ,RegionPrivateDTO region, TipoIncidenciaPrivateDTO tipoIncidencia) {
        this.id = id;
        this.latitud = latitud;
        this.longitud = longitud;
        this.causa = causa;
        this.nivelIncidencia = nivelIncidencia;
        this.carretera = carretera;
        this.fechaInicio = fechaInicio;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.region = region;
        this.tipoIncidencia = tipoIncidencia;
    }


    
    public IncidenciaPrivateDTO() {
    }
}
