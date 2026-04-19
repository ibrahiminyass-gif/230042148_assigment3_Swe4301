package com.jah.lsp.refactored;

public class Eagle extends Bird implements FlyingBird {

    @Override
    public void eat() {
        System.out.println("Eagle eats fish.");
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle screams!");
    }

    @Override
    public void fly() {
        System.out.println("Eagle soars high!");
    }
}
