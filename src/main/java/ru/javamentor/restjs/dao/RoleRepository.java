package ru.javamentor.restjs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.javamentor.restjs.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
