package com.devrestapi.rest_api.model;


import jakarta.annotation.Nonnull;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "rol_usuario")
public class RolUsuario {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
	@ManyToOne
	@Nonnull
	@JoinColumn(name = "rol")
	@Basic(fetch = FetchType.LAZY)
    private Rol rol;
	
	@ManyToOne
	@Nonnull
	@JoinColumn(name = "usuario")
	@Basic(fetch = FetchType.LAZY)
    private Usuario usuario;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
