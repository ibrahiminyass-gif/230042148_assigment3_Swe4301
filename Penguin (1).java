package com.jah.lsp.refactored;

public class Penguin extends Bird {

    @Override
    public void eat() {
        System.out.println("Penguin eats krill.");
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin squawks!");
    }
}
