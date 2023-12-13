package ups.edu.ec.microservice.curso.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ups.edu.ec.microservice.curso.dto.EstudianteDTO;
import ups.edu.ec.microservice.curso.dto.ProfesorDTO;

import java.util.List;

@FeignClient(name="msvc-estudiante",url="localhost:8090/ms/estudiante")
public interface StudentClient {
    @GetMapping("/buscar/{cedula}")
    EstudianteDTO obtenerEstudiante(@PathVariable String cedula);
}
