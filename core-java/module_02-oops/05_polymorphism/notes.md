# Module 2 - OOP (Polymorphism)

## What is Polymorphism?

Polymorphism means "many forms".

It allows one method to behave differently based on context.

---

## Types of Polymorphism

### 1. Compile-Time (Method Overloading)

Same method name, different parameters.

Example:

```java
int add(int a, int b)
double add(double a, double b)
```

---

### 2. Runtime (Method Overriding)

Child class provides its own implementation of parent method.

---

## Method Overloading Rules

- Same method name
- Different parameters (type or number)

---

## Method Overriding Rules

- Same method name
- Same parameters
- Inheritance required
- Method must not be private

---

## @Override Annotation

Used to indicate method overriding.

Helps avoid mistakes.

---

## Key Takeaways

- Overloading → compile-time  
- Overriding → runtime  
- Enables flexible and reusable code