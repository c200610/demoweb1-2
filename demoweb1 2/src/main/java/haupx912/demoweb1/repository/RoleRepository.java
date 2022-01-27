package haupx912.demoweb1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import haupx912.demoweb1.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role getById(Long id);

}
