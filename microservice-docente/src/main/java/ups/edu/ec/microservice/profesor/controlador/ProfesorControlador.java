package ups.edu.ec.microservice.profesor.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ups.edu.ec.microservice.profesor.modelo.Profesor;
import ups.edu.ec.microservice.profesor.servicio.ProfesorServicio;

import java.net.URI;
import java.util.List;
@RestController
@RequestMapping("/microservice/profesor")
public class ProfesorControlador {
    @Autowired // es similar al inject
    public ProfesorServicio profesorServicio;

    // Para consumir el Guardar Clientes desde Postman o FronEnd
    @PostMapping("/guardar")
    public ResponseEntity<Profesor> save(@RequestBody Profesor profesor){
       Profesor t= profesorServicio.create(profesor);

        try {
            return ResponseEntity.created(new URI("/microservicio/cliente/guardar"+t.getCedula())).body(t);
        }
        catch (Exception ex)
        {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    //Para Consumir la lista de Clientes
    @GetMapping("/all")
    public ResponseEntity<List<Profesor>> listAll(){
        return ResponseEntity.ok(profesorServicio.listClientes());
    }

    @GetMapping("/buscar/{cedula}")
    public Profesor save(@PathVariable String cedula){
        return profesorServicio.read(cedula);
    }
}
