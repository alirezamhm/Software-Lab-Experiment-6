**Student 1**: Alireza Mohammadian - 97110188
**Student 2**: Kian Bakhtari - 97110025

# Abstract Factory
This is an implementation of the Garden project using Abstract Factory design pattern.

In this project, the client will get a GardenCreator and uses its methods to create trees and flowers. GardenCreator is an interface that different creators can implement. For example, we have two classes, IranianGardenCreator and JapaneseGardenCreator. Now, the GardenCreator has two methods that return a tree and a flower. Again because we have multiple trees and flowers first we have to create an interface for them. Then, we create Separate Flower and Tree classes for both Iranian and Japanese.

# Builder
This is an implementation of the Car Building project using Builder design pattern.

In this project, the Director defines the order of building steps. It works with a builder object through common Builder interface. The builder interface defines all possible ways to create a product. CarBuilder is an example of a builder that overrides its methods to create a car, CarManualBuilder is another example of this interface. the  Director gets the builder object from the client and starts creating the product when its corresponding method is called.

# Prototype
This is an implementation of the Shape project using Prototype design pattern.

In this project we have an abstract class called Shape that forces all child classes to have a method called _clone_ which returns a complete clone of itself with all properties having the same value. Rectangle and Circle are two classes that inherit from the Shape class and have to fill in the clone methods. So, when we create a rectangle or a circle and use the clone method, we get an exact clone with the same values.

# Questions

## 1.

* **Creational patterns**: These patterns provide various object creation mechanisms, which increase flexibility and reuse of existing code. They provide general suggestions on how to create software objects. Thanks to the flexible structure they use we can create the necessary objects based on predetermined situations. Creational patterns allow the system to call the appropriate object without tracking which object should be called.
* **Structural patterns**: Structural Design Patterns are design patterns that deal with how classes and objects can be composed to form larger structures in software engineering. The structural design patterns simplify the structure by identifying the relationships. These patterns focus on how the classes inherit from each other and how they are composed from other classes
* **Behavioral patterns**: These design patterns are a type of design pattern that focus on communication between objects, what goes on between objects and how they operate together. These patterns are concerned with the way objects interact and operate with one another, and how they operate within a larger system

## 2.
All design patterns used in this experiment (Abstract Factory, Builder, and Prototype) are part of creational design patterns.

## 3.
The SOLID principles are general and more  focused on the architecture of the software while the GoF design patterns are more focused on the implementation details of the software and are local and give possible solutions to different requirements.

## 4.   
The Singleton design pattern violates the Single Responsibility Principle since the objects control how they are created and manage their life-cycle. This clearly contradicts the Single Responsibility Principle which states that a class should have one and only one reason for change