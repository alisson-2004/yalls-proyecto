package pe.com.yalls.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.yalls.entidades.DetalleBoleta;

public interface DetalleBoletaRepository extends JpaRepository<DetalleBoleta, String>{
    
}
