package api.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import java.util.List;
import com.vladmihalcea.hibernate.type.array.ListArrayType;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.Type;
import api.model.Solicitud;


@Entity
@Table(name = "registro", schema="public")

public class Registro {
	
	@Column(name = "id")
    private @Id @GeneratedValue Long id;

    @OneToOne(targetEntity=Solicitud.class)
    @JoinColumn(name = "idsolicitud", referencedColumnName = "id")
	private Solicitud idsolicitud;

	@Column(name = "fecha_inicio")
	private String fecha_inicio;

	@Column(name = "fecha_termino")
	private String fecha_termino;


	Registro() {}

	Registro(Solicitud idSolicitud, String fecha_inicio, String fecha_termino) {
        this.idsolicitud = idSolicitud;
		this.fecha_inicio = fecha_inicio;
		this.fecha_termino = fecha_termino;

	}
    //Getters
	public Long getId() {
		return this.id;
    }
    public Solicitud getIdSolicitud() {
		return this.idsolicitud;
	}
	public String getFecha_inicio() {
		return this.fecha_inicio;
	}
	public String getFecha_termino() {
		return this.fecha_termino;
    }
    //Setters
	public void setId(Long id) {
		this.id = id;
    }
    public void setIdSolicitud(Solicitud idSolicitud) {
		this.idsolicitud = idSolicitud;
	}
	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public void setFecha_termino(String fecha_termino) {
		this.fecha_termino = fecha_termino;
	}

}
