# 🤖 Strategy Design Pattern - Robot System

A simple Java project demonstrating the **Strategy Design Pattern** using a configurable robot system. The project showcases how **composition** can be used instead of **inheritance** to build flexible and maintainable software.

## 🚀 Features

- 💬 Configurable Talking behavior
- 🚶 Configurable Walking behavior
- ✈️ Configurable Flying behavior
- 🤖 Multiple Robot Types (Companion, Military, Industrial)
- 🔄 Runtime behavior selection using Strategy Pattern

---

## 🏗️ Design Pattern Used

This project implements the **Strategy Design Pattern**, where each robot capability is encapsulated into its own strategy.

- **Context:** `Robot`
- **Strategies:** `Talkable`, `Walkable`, `Flyable`, `Projection`
- **Concrete Strategies:** `TalkingStrategy`, `SilentStrategy`, `WalkingStrategy`, `FlyingStrategy`, etc.
- **Client:** `Main`

This design allows robot behaviors to be changed without modifying the `Robot` class.

---

## 💡 Example

```java
Robot robot = new Robot(
    new TalkingStrategy(),
    new WalkingStrategy(),
    new FlyingStrategy(),
    new CompanionProjection()
);

robot.talk();
robot.walk();
robot.fly();
robot.project();
```

---

## 📂 Project Structure

```text
src/
└── com/
    └── robot/
        ├── Main.java
        ├── model/
        └── strategy/
            ├── talk/
            ├── walk/
            ├── fly/
            └── projection/
```

---

## 🎯 Learning Objectives

- Strategy Design Pattern
- Composition over Inheritance
- Runtime Polymorphism
- Loose Coupling
- SOLID Principles
- Low-Level Design (LLD)

---

## 🛠️ Tech Stack

- Java
- Object-Oriented Programming (OOP)

---

⭐ This project is part of my **Low-Level Design (LLD)** learning journey, focusing on implementing design patterns through real-world examples.