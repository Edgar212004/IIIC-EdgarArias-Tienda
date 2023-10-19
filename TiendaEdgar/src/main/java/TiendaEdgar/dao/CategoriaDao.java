
package TiendaEdgar.dao;

    import TiendaEdgar.domain.Categoria;
    import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository <Categoria,Long> {
    
}
