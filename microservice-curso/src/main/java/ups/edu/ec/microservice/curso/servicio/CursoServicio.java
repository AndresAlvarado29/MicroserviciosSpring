package ups.edu.ec.microservice.curso.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ups.edu.ec.microservice.curso.modelo.Curso;
import ups.edu.ec.microservice.curso.repositorio.CursoRepositorio;

import java.util.List;

@Service
public class CursoServicio {
    @Autowired // es como el inject
    private CursoRepositorio cursoRepositorio;

    //Servicio de crear Docentes
    public Curso create(Curso curso){
        return cursoRepositorio.save(curso);

    }
    //Servicios de Listar Serviciso

    public List<Curso> listCurso() {
        return cursoRepositorio.findAll();
    }
}
