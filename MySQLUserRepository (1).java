package com.jah.dip.refactored;

public class MySQLUserRepository implements UserRepository {

    @Override
    public void save(String user) {
        System.out.println("Saving user [" + user + "] to MySQL database...");
    }

    @Override
    public String findById(int id) {
        return "User#" + id + " from MySQL";
    }
}
