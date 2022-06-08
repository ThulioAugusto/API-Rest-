package thulio.restJava.repository;

import org.springframework.data.repository.CrudRepository;
import thulio.restJava.user.Users;

public interface UsersRepository extends CrudRepository< Users, Integer> {
}
