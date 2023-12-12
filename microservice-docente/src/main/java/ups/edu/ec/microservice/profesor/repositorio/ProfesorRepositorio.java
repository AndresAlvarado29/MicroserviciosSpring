package ups.edu.ec.microservice.profesor.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ups.edu.ec.microservice.profesor.modelo.Profesor;

@Repository
public interface ProfesorRepositorio extends JpaRepository<Profesor, Long> {
}