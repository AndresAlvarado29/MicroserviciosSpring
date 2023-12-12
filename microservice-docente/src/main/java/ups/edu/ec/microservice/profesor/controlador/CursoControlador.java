package ups.edu.ec.microservice.profesor.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ups.edu.ec.microservice.profesor.modelo.Curso;
import ups.edu.ec.microservice.profesor.servicio.CursoServicio;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/microservice/curso")
public class CursoControlador {
    @Autowired // es similar al inject
    public CursoServicio cursoServicio;

    //Para consumir el guardar
    @PostMapping("/guardar")
    public ResponseEntity<Curso> save(@RequestBody Curso curso){
        Curso c= cursoServicio.create(curso);

        try{
            return ResponseEntity.created(new URI("/MS2/Curso/guardar"+c.getId())).body(c);
        }
        catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    // para consumir el listar
    @GetMapping("/all")
    public ResponseEntity<List<Curso>> listAll(){
        return ResponseEntity.ok(cursoServicio.listCurso());
    }
}
