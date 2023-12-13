package ups.edu.ec.microservice.curso.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ups.edu.ec.microservice.curso.dto.ProfesorDTO;

@FeignClient(name="msvc-profesor",url="localhost:8190/microservice/profesor")
public interface TeacherClient {
    @GetMapping("/buscar/{cedula}")
    ProfesorDTO obtenerProfesor(@PathVariable String cedula);
}
