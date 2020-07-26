package api.model;

import java.util.Objects;
import java.sql.Timestamp;

import javax.persistence.GenerationType;
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
@Table(name = "reserva", schema="public")

public class Reserva{
	
	@Column(name = "id")
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(targetEntity=Solicitud.class)
    @JoinColumn(name = "idsolicitud", referencedColumnName = "id")
	private Solicitud idsolicitud;

	@Column(name = "fecha_inicio")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Timestamp fecha_inicio;

	@Column(name = "fecha_termino")
	private Timestamp fecha_termino;


	Reserva() {}

	Reserva(Solicitud idSolicitud) {
        this.idsolicitud = idSolicitud;
	}
    //Getters
	public Long getId() {
		return this.id;
    }
    public Solicitud getIdSolicitud() {
		return this.idsolicitud;
	}
	public Timestamp getFecha_inicio() {
		return this.fecha_inicio;
	}
	public Timestamp getFecha_termino() {
		return this.fecha_termino;
    }
    //Setters
	public void setId(Long id) {
		this.id = id;
    }
    public void setIdSolicitud(Solicitud idSolicitud) {
		this.idsolicitud = idSolicitud;
	}
	public void setFecha_inicio(Timestamp fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public void setFecha_termino(Timestamp fecha_termino) {
		this.fecha_termino = fecha_termino;
	}

}
