
package TiendaEdgar.dao;
//Imports de la clase
import TiendaEdgar.domain.Categoria; 
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository<Categoria, Long> {
    
    
    
}// Fin de la clase
