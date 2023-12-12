package ups.edu.ec.microservice.estudiante.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Cliente")
public class Cliente {
    @Id
    @Column(name="cli_cedula")
    private String cedula;
    @Column(name="cli_nombre")
    private String nombre;
    @Column(name="cli_apellido")
    private String apellido;
    @Column(name="cli_correo")
    private String correo;
    @Column(name="cli_contrasena")
    private String contrasena;
    @Column(name="cli_celular")
    private String celular;
    @Column(name="cli_direccion")
    private String direccion;

    public Cliente(String cedula, String nombre, String apellido, String correo, String contrasena, String celular, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
        this.celular = celular;
        this.direccion = direccion;
    }

    public Cliente() {

    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
