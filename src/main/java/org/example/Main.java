package org.example;

import org.example.firstExcersise.Car;
import org.example.firstExcersise.Rectangle;
import org.example.secondExcersise.abstr.Bird;
import org.example.secondExcersise.abstr.Dog;
import org.example.secondExcersise.interf.impl.Cash;
import org.example.secondExcersise.interf.impl.CreditCard;
import org.example.secondExcersise.interf.impl.Paypal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
//        Car car = new Car("Toyota", "Camry", 2023);
//
//        System.out.println(car);
//
//        car.setMake("Auto");
//        car.setModel("Velké");
//        car.setYear(2021);
//
//        System.out.println(car);
//
//        Rectangle rect = new Rectangle(2, 4);
//
//        double area = rect.getArea();
//
//        System.out.println("Area of rectangle is: "+ area);
//
//
//        ///////////////////////////////////////////////////////
//
//        Bird bird = new Bird();
//        bird.makeSound();
//        Dog dog = new Dog();
//        dog.makeSound();
//
//        Cash cash = new Cash();
//        CreditCard cc = new CreditCard();
//        Paypal pp = new Paypal();
//
//        cash.processPayment(300);
//        cc.processPayment(200);
//        pp.processPayment(450);

    }
}