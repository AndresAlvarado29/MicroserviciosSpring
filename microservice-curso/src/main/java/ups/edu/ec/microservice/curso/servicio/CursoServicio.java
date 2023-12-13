package ups.edu.ec.microservice.curso.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ups.edu.ec.microservice.curso.client.StudentClient;
import ups.edu.ec.microservice.curso.client.TeacherClient;
import ups.edu.ec.microservice.curso.dto.EstudianteDTO;
import ups.edu.ec.microservice.curso.dto.ProfesorDTO;
import ups.edu.ec.microservice.curso.modelo.Curso;
import ups.edu.ec.microservice.curso.repositorio.CursoRepositorio;

import java.util.List;

@Service
public class CursoServicio {
    @Autowired // es como el inject
    private CursoRepositorio cursoRepositorio;
    @Autowired
    private StudentClient studentClient;
    @Autowired
    private TeacherClient teacherClient;

    //Servicio de crear Docentes
    public Curso create(Curso curso){
        return cursoRepositorio.save(curso);

    }
    //Servicios de Listar Serviciso

    public List<Curso> listCurso() {
        return cursoRepositorio.findAll();
    }

    /*public List<EstudianteDTO> getUsers(){
        return studentClient.encontrarEstudiante();
    }*/

    public ProfesorDTO obtenerProfesor(String cedula){
        return teacherClient.obtenerProfesor(cedula);
    }
    public EstudianteDTO obtenerEstudiante(String cedula){
        return studentClient.obtenerEstudiante(cedula);
    }
}
