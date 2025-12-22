package com.ap.edu_tech.repository;

import com.ap.edu_tech.model.RoleModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<RoleModel,Long> {
    RoleModel findByName(String roleName);
}
