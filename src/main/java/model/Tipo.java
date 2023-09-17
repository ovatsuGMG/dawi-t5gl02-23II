package model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "tb_tipos")
public class Tipo {
	@Id
	private int idtipo;
	private String descripcion;
	
	
	@Override
	public String toString() {
		return "Tipo [idtipo=" + idtipo + ", descripcion=" + descripcion + "]";
	}
	public Tipo() {
		
	}
	public Tipo(int idtipo, String descripcion) {
		super();
		this.idtipo = idtipo;
		this.descripcion = descripcion;
	}
	public int getIdtipo() {
		return idtipo;
	}
	public void setIdtipo(int idtipo) {
		this.idtipo = idtipo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
