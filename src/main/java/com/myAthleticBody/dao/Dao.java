package com.myAthleticBody.dao;

import com.myAthleticBody.models.User;

import java.util.List;

public interface Dao <T> {
    Object get(long id);

    List<T> getAll();

    void save(T t);

    /*void update(T t, String[] params);

    void delete(T t);*/
}
