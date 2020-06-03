package com.crudspringboot.clienteapp.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCliente;
	private String nombres;
	private String apellidos;
	private String telefono;
	private String email;
	private String ciudad;
	private Ciudad idCiudad;

}
