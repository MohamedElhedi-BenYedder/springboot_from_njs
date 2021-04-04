package tn.hospital_system_management.springboot_from_njs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Component;
import tn.hospital_system_management.springboot_from_njs.Repository.UserRepository;
import tn.hospital_system_management.springboot_from_njs.model.User;

import java.util.List;
import java.util.Optional;

@Component
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public boolean signup(User user) {
        if (!userRepository.existsById(user.getUsername())) {
            userRepository.save(user);
            return true;
        }
        else return false;
        }

    @Override
    public User login(User user) {

        userRepository.save(new User("admin","admin","admin",0));
        Example<User> users = Example.of(user);
        Optional<User> UserOptional = userRepository.findOne(users);
        if (UserOptional.isPresent()) {
            user = UserOptional.get();
            return user;

        }
        else return new User();// we need to handle Patient Not Found Exception

    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
