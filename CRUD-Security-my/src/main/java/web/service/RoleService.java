package web.service;

import web.models.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();

    Role findByName(String name);

    void save (Role role);
}
