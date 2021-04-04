package tn.hospital_system_management.springboot_from_njs.service;

import tn.hospital_system_management.springboot_from_njs.model.User;

import java.util.List;

public interface UserService {
    public User create(User user);
    public boolean signup(User user);
    public User login(User User);
    public List<User> getAll();

}
