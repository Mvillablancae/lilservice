package api.model;

import java.util.Objects;
import java.sql.Timestamp;

import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;
import com.vladmihalcea.hibernate.type.array.ListArrayType;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.Type;


@Entity
@Table(name = "solicitud", schema="public")
@TypeDef(
    name = "list-array",
    typeClass = ListArrayType.class
)
public class Solicitud {
	
	@Column(name = "id")
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "id_recurso")
	private int id_recurso;

	@Column(name = "fechasol")
	private Timestamp fechasol;

	@Column(name = "tipo_recurso")
	private int tipo_recurso;

	@Type(type = "list-array")
	@Column(name = "equipamiento",
	columnDefinition = "integer[]")
	private List<Integer> equipamiento;

	@Column(name = "procedimiento")
	private String procedimiento;

	@Type(type = "list-array")
	@Column(name = "equipo",
	columnDefinition = "integer[]")
	private List<Integer> equipo;

	@Column(name = "estado")
	private boolean estado;
	
	
	/*
	  
	  */

	Solicitud() {}

	Solicitud(Timestamp fechasol, int tipo_recurso, int id_recurso, List<Integer> equipamiento, String procedimiento, List<Integer> equipo, boolean estado) {
		this.fechasol = fechasol;
		this.tipo_recurso = tipo_recurso;
		this.id_recurso = id_recurso;
		this.equipamiento = equipamiento;
		this.procedimiento = procedimiento;
		this.equipo = equipo;
		this.estado = estado;
	}

	public Long getId() {
		return this.id;
	}
	public Timestamp getFecha() {
		return this.fechasol;
	}
	public int getTipo() {
		return this.tipo_recurso;
	}
	public int getIdRecurso() {
		return this.id_recurso;
	}

	public List<Integer> getEquipamiento() {
		return this.equipamiento;
	}
	public String getProcedimiento() {
		return this.procedimiento;
	}

	public List<Integer> getEquipo() {
		return this.equipo;
	}

	public boolean getEstado() {
		return this.estado;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public void setFecha(Timestamp fechasol) {
		this.fechasol = fechasol;
	}
	public void setIdRecurso(int id_recurso) {
		this.id_recurso = id_recurso;
	}
	public void setTipoRecurso(int tipo_recurso) {
		this.tipo_recurso = tipo_recurso;
	}

	public void setEquipamiento(List<Integer> equipamiento) {
		this.equipamiento = equipamiento;
	}

	public void setProcedimiento(String proc) {
		this.procedimiento = proc;
	}

	public void setEquipo(List<Integer> equipo) {
		this.equipo = equipo;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	/*@Override
	public boolean equals(Object o) {

		if (this == o)
			return true;
		if (!(o instanceof Solicitud))
			return false;
			Solicitud solicitud = (Solicitud) o;
		return Objects.equals(this.id, solicitud.id) && Objects.equals(this.name, solicitud.name)
				&& Objects.equals(this.role, solicitud.role);
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.id, this.equipo, this.pabellon);
	}*/

	@Override
	public String toString() {
		return "Solicitud{" + "id=" + this.id + ", equipamiento='" + this.equipamiento
		+ ", procedimiento='" + this.procedimiento + ", equipo='" + this.equipo 
		+ '\'' + ", estado='" + this.estado + '\'' + '}';
	}
}
