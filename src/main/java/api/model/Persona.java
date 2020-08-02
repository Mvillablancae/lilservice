package api.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name = "persona")
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_persona")
	private long idPersona;
	
	
	private String nombre;
	private String apellido;
	private int identificador;
	private String especializacion;
	private int estado;
	
	
	@ManyToMany()
	private Set<Equipo> listaEquipos = new HashSet<>();
		
	
	public Persona() {
		
	}
	
  

	public Persona(long idPersona, String nombre, String apellido, int identificador, String especializacion,
			int estado, Set<Equipo> listaEquipos) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellido = apellido;
		this.identificador = identificador;
		this.especializacion = especializacion;
		this.estado = estado;
		this.listaEquipos = listaEquipos;
	}



	public long getIdPersona() {
		return idPersona;
	}


	public void setIdPersona(long idPersona) {
		this.idPersona = idPersona;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getIdentificador() {
		return identificador;
	}


	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}


	public String getEspecializacion() {
		return especializacion;
	}


	public void setEspecializacion(String especializacion) {
		this.especializacion = especializacion;
	}


	public int getEstado() {
		return estado;
	}


	public void setEstado(int estado) {
		this.estado = estado;
	}


	public Set<Equipo> getListaEquipos() {
		return listaEquipos;
	}


	public void setListaEquipos(Set<Equipo> listaEquipos) {
		this.listaEquipos = listaEquipos;
	}
	
	
	
	
	
	

}
