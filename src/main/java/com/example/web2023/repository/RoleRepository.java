package com.example.web2023.repository;

import com.example.web2023.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
     Role findByName(String name);
}
