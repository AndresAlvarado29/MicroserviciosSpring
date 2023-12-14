package ups.edu.ec.microservice.curso.modelo;

import jakarta.persistence.*;
import ups.edu.ec.microservice.curso.dto.ProfesorDTO;

@Entity
@Table(name = "Curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private int numeroDeHoras;
    @ManyToOne
    @JoinColumn(name = "profesor")
    private Profesor profesor;

    public Curso() {
    }

    public Curso(int id, String nombre, int numeroDeHoras, Profesor profesor) {
        this.id = id;
        this.nombre = nombre;
        this.numeroDeHoras = numeroDeHoras;
        this.profesor = profesor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDeHoras() {
        return numeroDeHoras;
    }

    public void setNumeroDeHoras(int numeroDeHoras) {
        this.numeroDeHoras = numeroDeHoras;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
