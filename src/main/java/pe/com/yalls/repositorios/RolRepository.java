
package pe.com.yalls.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.yalls.entidades.Rol;

public interface RolRepository extends JpaRepository<Rol, Long>{
    
}