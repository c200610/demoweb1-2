package haupx912.demoweb1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import haupx912.demoweb1.model.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role getById(Long id);

}
