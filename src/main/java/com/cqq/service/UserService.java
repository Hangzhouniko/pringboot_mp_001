package com.cqq.service;

import com.cqq.domain.User;

import java.util.List;

public interface UserService {
    public boolean save(User user);

    public boolean delete(Integer id);

    public boolean update(User user);

    public User getById(Integer id);

    public List<User> getAll();
}
