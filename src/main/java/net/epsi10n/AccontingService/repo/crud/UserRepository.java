package net.epsi10n.AccontingService.repo.crud;

import net.epsi10n.AccontingService.data.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
