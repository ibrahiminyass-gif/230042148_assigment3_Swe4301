package com.jah.lsp.refactored;

public class BirdController {

    public void makeBirdFly(FlyingBird bird) {
        bird.fly();
    }

    public void feedBird(Bird bird) {
        bird.eat();
    }
}
