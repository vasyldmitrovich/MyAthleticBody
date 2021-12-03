package com.myAthleticBody.dao.impl;

import com.myAthleticBody.dao.Dao;
import com.myAthleticBody.models.User;
import com.myAthleticBody.models.UserProfile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//TODO In future will take data from DB

@Component
public class UserDaoImpl implements Dao<User> {

    /*This static variable is  only for testing*/
    private static int USERS_COUNT;
    private static List<User> list = new ArrayList<>();
    /*{
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(7);
        list.add(new User(++USERS_COUNT,"rrr@gmail.com","12345",
                new UserProfile(USERS_COUNT,"Tom"),arrayList));
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(6);
        arrayList1.add(9);
        arrayList1.add(2);
        list.add(new User(++USERS_COUNT,"two@ukr.net","111",
                new UserProfile(USERS_COUNT,"Bob"),arrayList1));
    }*/

    @Override
    public User get(long id) {
        return list.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }

    @Override
    public List<User> getAll() {
        return list;
    }

    @Override
    public void save(User user) {
        user.setId(++USERS_COUNT);
        list.add(user);
    }
}
