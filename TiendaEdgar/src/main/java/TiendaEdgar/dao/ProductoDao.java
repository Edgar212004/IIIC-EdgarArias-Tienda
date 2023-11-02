package TiendaEdgar.dao;
//Imports de la clase
import TiendaEdgar.domain.Producto; 
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository<Producto, Long> {
    
    
    
}// Fin de la clase
