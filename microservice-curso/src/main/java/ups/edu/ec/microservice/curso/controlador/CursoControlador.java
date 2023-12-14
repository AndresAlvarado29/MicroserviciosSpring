package ups.edu.ec.microservice.curso.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ups.edu.ec.microservice.curso.dto.EstudianteDTO;
import ups.edu.ec.microservice.curso.dto.ProfesorDTO;
import ups.edu.ec.microservice.curso.modelo.Curso;
import ups.edu.ec.microservice.curso.modelo.Profesor;
import ups.edu.ec.microservice.curso.servicio.CursoServicio;

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
        try{
        cursoServicio.create(curso);
            return ResponseEntity.status(HttpStatus.OK).body(curso);
        } catch (Exception e) {
            e.printStackTrace();
            Error error = new Error();

        }
        return null;
    }


    // para consumir el listar
    @GetMapping("/all")
    public ResponseEntity<List<Curso>> listAll(){
        return ResponseEntity.ok(cursoServicio.listCurso());
    }

   /* @GetMapping("/buscar")
    public ResponseEntity<List<EstudianteDTO>> getAll(){
        return new ResponseEntity<>(cursoServicio.getUsers(),HttpStatus.OK);
    }*/

    @GetMapping("/buscarPro/{cedula}")
    public ProfesorDTO save(@PathVariable String cedula){
        return cursoServicio.obtenerProfesor(cedula);
    }

    @GetMapping("/buscarEst/{cedula}")
    public EstudianteDTO saveE(@PathVariable String cedula){return cursoServicio.obtenerEstudiante(cedula);}
}
