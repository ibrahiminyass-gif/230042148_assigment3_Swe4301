package com.jah.dip.refactored;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(String user) {
        userRepository.save(user);
    }

    public String getUser(int id) {
        return userRepository.findById(id);
    }
}
