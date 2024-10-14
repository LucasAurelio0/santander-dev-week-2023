package me.dio.santander_dev_week_2023.service.implementation;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import me.dio.santander_dev_week_2023.domain.model.User;
import me.dio.santander_dev_week_2023.domain.repository.UserRepository;
import me.dio.santander_dev_week_2023.service.UserService;

@Service
public class UserServiceImplementation implements UserService {

    private final UserRepository userRepository;

    public UserServiceImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User save(User toBeUser) {
        if(toBeUser.getId() != null && userRepository.existsById(toBeUser.getId())){
            throw new IllegalArgumentException("This user id already exists");
        }
        if(userRepository.existsByAccountNumber(toBeUser.getAccount().getNumber())){
            throw new IllegalArgumentException("This account number already exists");
        }
        return userRepository.save(toBeUser);
    }

}
