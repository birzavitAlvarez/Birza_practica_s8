package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="steam")
public class Steam {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)//SEQUENCE
    @Column(name = "id_steam",nullable = false)
    private Integer id;

    @Column(name = "nombre_steam", nullable=false,length=40)
    private String nombre;

    @Column(name = "usuario_steam", nullable=false,length=40)
    private String usuario;

    @Column(name = "identificador_steam", nullable=false)
    private Integer identificador;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_directorio") //parametro de relación puede ser cualquier nombre
    private Directorio directorio;

    public Steam() {
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public Directorio getDirectorio() {
        return directorio;
    }

    public void setDirectorio(Directorio directorio) {
        this.directorio = directorio;
    }


}
