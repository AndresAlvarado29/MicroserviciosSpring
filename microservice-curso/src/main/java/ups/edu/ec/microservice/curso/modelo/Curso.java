package ups.edu.ec.microservice.curso.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "Curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private int numeroDeHoras;

    public Curso() {
    }

    public Curso(int id, String nombre, int numeroDeHoras) {
        this.id = id;
        this.nombre = nombre;
        this.numeroDeHoras = numeroDeHoras;
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


}
