# Module 2 - OOP (Constructors)

## What is a Constructor?

A constructor is a special method used to initialize objects.

---

## Key Properties

- Same name as class
- No return type (not even void)
- Called automatically when object is created

---

## Default Constructor

If no constructor is defined, Java provides one by default.

Example:
class Student {
    String name;
}

Student s1 = new Student();

---

## Parameterized Constructor

Constructor with parameters.

Example:
class Student {
    String name;

    Student(String n) {
        name = n;
    }
}

---

## this Keyword (Intro)

Used to refer to current object.

Example:
this.name = name;

---

## Why Constructors?

- Initialize object data
- Avoid repetitive code
- Ensure object is created properly

---

## Key Takeaways

- Constructor runs at object creation
- Helps set initial values
- this helps resolve naming conflicts