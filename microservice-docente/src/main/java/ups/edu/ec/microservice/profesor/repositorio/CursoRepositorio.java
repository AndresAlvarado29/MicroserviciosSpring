package ups.edu.ec.microservice.profesor.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import ups.edu.ec.microservice.profesor.modelo.Curso;

public interface CursoRepositorio extends JpaRepository<Curso, Long> {
}
