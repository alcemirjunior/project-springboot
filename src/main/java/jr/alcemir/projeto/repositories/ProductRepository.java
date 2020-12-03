package jr.alcemir.projeto.repositories;

import jr.alcemir.projeto.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //nao eh necessario pois extende um repository, anotado so pra questao de estudo
public interface ProductRepository extends JpaRepository <Product, Long> {

}
