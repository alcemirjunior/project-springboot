package jr.alcemir.projeto.repositories;

import jr.alcemir.projeto.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {

}
