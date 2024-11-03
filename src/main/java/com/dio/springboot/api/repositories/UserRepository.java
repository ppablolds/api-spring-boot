package com.dio.springboot.api.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dio.springboot.api.model.User;

@Repository
public class UserRepository {

    public void save(User user) {
        if (user.getId() == null) {
            System.out.println("SAVE - Recebendo usuário na camada repository");
        } else {
            System.out.println("UPDATE - Recebendo usuário na camada repository");
        }

        System.out.println(user);
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuario", id));
        System.out.println(id);
    }

    public List<User> findAll() {
        System.out.println("FIND ALL - Listando usuários do sistema");
        List<User> users = new ArrayList<>();
        users.add(new User("Pablo", "123"));
        users.add(new User("Maria", "123"));
        return users;
    }

    public User findById(Integer id) {
        System.out.println(String.format("FIND BY ID - Recebendo o id: %d para localizar um usuario", id));
        System.out.println(id);
        return new User("Pablo", "123");
    }

    public User findByUsername(String username) {
        System.out.println(String.format("FIND BY USERNAME - Recebendo o username: %s para localizar um usuario", username));
        System.out.println(username);
        return new User("Maria", "123");
    }

}
