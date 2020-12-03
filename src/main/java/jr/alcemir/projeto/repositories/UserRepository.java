package jr.alcemir.projeto.repositories;

import jr.alcemir.projeto.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //nao eh necessario pois extende um repository, anotado so pra questao de estudo
public interface UserRepository extends JpaRepository <User, Long> {

}
