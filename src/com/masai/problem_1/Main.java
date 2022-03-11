package com.masai.problem_1;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Tiger()};

        //Calling for Dog
        animals[0].eat();
        animals[0].walk();
        animals[0].makeNoise();

        //Calling for Cat
        animals[1].eat();
        animals[1].walk();
        animals[1].makeNoise();

        //Calling for Tiger
        animals[2].eat();
        animals[2].walk();
        animals[2].makeNoise();
    }
}