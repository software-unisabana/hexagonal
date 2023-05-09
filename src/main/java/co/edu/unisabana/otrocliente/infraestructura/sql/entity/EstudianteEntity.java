package co.edu.unisabana.otrocliente.infraestructura.sql.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EstudianteEntity {

  private Long id;

  private String nombre;
  private String facultad;

  public EstudianteEntity() {

  }

  public void setId(Long id) {
    this.id = id;
  }

  @Id
  public Long getId() {
    return id;
  }

  public EstudianteEntity(String nombre, String facultad) {
    this.nombre = nombre;
    this.facultad = facultad;
  }
}
