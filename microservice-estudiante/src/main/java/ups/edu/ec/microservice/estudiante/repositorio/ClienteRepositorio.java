package ups.edu.ec.microservice.estudiante.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ups.edu.ec.microservice.estudiante.modelo.Cliente;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {
}