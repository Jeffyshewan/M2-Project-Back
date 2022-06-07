package com.AirData.M2ProjectBack.role;

public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepository;

    @Override
    public Role findById(Integer id) {
        return roleRepository.getById(id);
    }

    @Override
    public void create(Role role) {
        roleRepository.save(role);
    }
}
