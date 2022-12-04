package com.moko.laboratoirebackend.User;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public List<User> getUsers() {
        return List.of(
                new User(
                        1L,
                        "Federico",
                        "Pa$$w0rd"
                )
        );
    }
}
