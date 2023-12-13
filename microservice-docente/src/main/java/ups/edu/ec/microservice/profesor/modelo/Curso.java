package ups.edu.ec.microservice.profesor.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "Curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private int numeroDeHoras;
    @ManyToOne
    @JoinColumn(name = "profesor_cedula")
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
