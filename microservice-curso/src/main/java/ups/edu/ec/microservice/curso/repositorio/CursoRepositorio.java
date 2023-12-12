package ups.edu.ec.microservice.curso.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import ups.edu.ec.microservice.curso.modelo.Curso;

public interface CursoRepositorio extends JpaRepository<Curso, Long> {
}
