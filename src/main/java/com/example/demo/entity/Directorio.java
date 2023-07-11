package com.example.demo.entity;

import java.util.*;
import jakarta.persistence.*;

@Entity
@Table(name="directorio")
public class Directorio {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)//SEQUENCE
    @Column(name = "id_directorio",nullable = false)
    private Integer id;

    @Column(name = "nombre_directorio",nullable=false,length=40)
    private String nombre;

    @OneToMany(targetEntity = Steam.class, mappedBy = "directorio")// aquí entra la entidad de esta clase
    @OrderBy("nombre ASC")
    private Set<Steam> steams = new HashSet<Steam>();

    public Directorio() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Steam> getSteams() {
        return steams;
    }

    public void setSteams(Set<Steam> steams) {
        this.steams = steams;
    }

}
