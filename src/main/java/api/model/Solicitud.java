package api.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Table(name = "solicitud", schema="public")
public class Solicitud {
	@Column(name = "id")
	private @Id @GeneratedValue Long id;
	@Column(name = "equipamiento")
	private String equipamiento;
	@Column(name = "procedimiento")
	private String procedimiento;
	@Column(name = "equipo")
	private String equipo;
	@Column(name = "p_or_s")
	private boolean p_or_s;

	Solicitud() {}

	Solicitud(String equipamiento, String procedimiento, String equipo, boolean p_or_s) {

		this.equipamiento = equipamiento;
		this.procedimiento = procedimiento;
		this.equipo = equipo;
		this.p_or_s = p_or_s;
	}

	public Long getId() {
		return this.id;
	}
	public String getEquipamiento() {
		return this.equipamiento;
	}
	public String getProcedimiento() {
		return this.procedimiento;
	}

	public String getEquipo() {
		return this.equipo;
	}

	public boolean getPabellon() {
		return this.p_or_s;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setEquipamiento(String equipamiento) {
		this.equipamiento = equipamiento;
	}

	public void setProcedimiento(String proc) {
		this.procedimiento = proc;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public void setP_or_S(boolean p_or_s) {
		this.p_or_s = p_or_s;
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
		+ '\'' + ", pabellón_or_sala'" + this.p_or_s + '\'' + '}';
	}
}
