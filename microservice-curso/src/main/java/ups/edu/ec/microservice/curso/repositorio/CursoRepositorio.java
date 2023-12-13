package ups.edu.ec.microservice.curso.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import ups.edu.ec.microservice.curso.dto.EstudianteDTO;
import ups.edu.ec.microservice.curso.modelo.Curso;

import java.util.List;

public interface CursoRepositorio extends JpaRepository<Curso, Long> {
}
