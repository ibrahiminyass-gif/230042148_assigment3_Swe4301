package com.jah.dip.original;

public class MySQLUserRepository {
    public void save(String user) {
        System.out.println("Saving user [" + user + "] to MySQL database...");
    }

    public String findById(int id) {
        return "User#" + id + " from MySQL";
    }
}
