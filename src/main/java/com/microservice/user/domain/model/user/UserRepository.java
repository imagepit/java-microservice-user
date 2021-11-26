package com.microservice.user.domain.model.user;

import java.util.List;

public interface UserRepository {
    // 参照系
    User findById(UserId id);
    List<User> findAll();

    // 更新系
    void add(User user);
    void update(User user);
    void delete(UserId id);
}
