package com.javatechie.aws.cicd.example;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class OrderDao {


    public List<Order> getOrders() {
        return Stream.of(
                new Order(101, "Mobile", 1, 30000),
                new Order(58, "Book", 4, 2000),
                new Order(205, "Laptop", 1, 150000),
                new Order(809, "headset", 1, 1799),
            new Order(100,"mathan",2,19000),
            new Order(299,"sathish",5,123),
            new Order(1,"Ruvith♡Boomika",3,1999),
             new Order(809, "headset", 1, 1799))
               
                .collect(Collectors.toList());
    }
}
