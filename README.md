# Family Tree LLD Solution

A Java-based Low Level Design (LLD) solution for managing a family tree and finding eligible marriage matches based on predefined family relationship rules.

## Problem Statement

Construct a family tree from the given member information.

Each member contains:

```
Name, Gender, Father Name, Mother Name
```

Find eligible marriage matches based on the following rules:

### Male

Eligible matches are:

- Father's Sister's Daughter
- Mother's Brother's Daughter

### Female

Eligible matches are:

- Father's Sister's Son
- Mother's Brother's Son

Assumptions:

- Every person's name is unique.
- Family relationships are maintained using parent-child references.

---

## Features

- Add new family members
- Automatically creates missing parents
- Stores complete family relationships
- Find eligible marriage matches
- Menu-driven console application
- Object-Oriented Design
- Uses Interfaces and Implementation classes

---

## Project Structure

```
FamilyTreeLLD/
│
├── Enums
│   └── Gender.java
│
├── Models
│   ├── FamilyBook.java
│   └── Member.java
│
├── Services
│   └── FamilyServices.java
│
├── Implementation
│   └── FamilyServicesImplementation.java
│
└── Main.java
```

---

## Class Responsibilities

### Member

Represents an individual in the family.

Stores:

- Name
- Gender
- Father
- Mother
- Children

---

### FamilyBook

Acts as an in-memory database.

Responsibilities:

- Store family members
- Retrieve members
- Check member existence
- Add new members

---

### FamilyServices

Service interface defining available operations.

Functions:

- Add Member
- Find Matches

---

### FamilyServicesImplementation

Implements all business logic.

Responsibilities:

- Create family members
- Maintain relationships
- Find eligible marriage matches

---

## Sample Input

```
John, Male, Brad, Lisa
Emma, Female, Brad, Lisa
Alex, Male, John, Jenny
Emily, Female, Steve, Emma
Rachel, Female, Steve, Emma
```

Find matches for:

```
Alex
```

Output:

```
Emily
Rachel
```

---

## How It Works

The algorithm traverses the family tree as follows.

For a Male:

```
Person
│
├── Father
│     └── Grandfather
│           └── Father's Sisters
│                 └── Their Daughters
│
└── Mother
      └── Grandfather
            └── Mother's Brothers
                  └── Their Daughters
```

For a Female:

```
Person
│
├── Father's Sisters
│      └── Their Sons
│
└── Mother's Brothers
       └── Their Sons
```

---

## Technologies Used

- Java
- Object-Oriented Programming
- Collections Framework
- HashMap
- ArrayList

---

## OOP Concepts Used

- Classes
- Objects
- Interfaces
- Encapsulation
- Abstraction
- Composition
- Separation of Concerns

---

## Future Improvements

- Prevent duplicate matches
- Validate parent genders
- Handle marriage relationships
- Add sibling queries
- Find grandparents
- Find cousins
- Store data using a database
- Add file input support
- Develop a GUI version

---

## Run

Clone the repository:

```bash
git clone https://github.com/Vimal-AFK/familyTreeLLD_Solution.git
```

Open the project in IntelliJ IDEA or any Java IDE.

Compile and run:

```bash
Main.java
```

---

## Author

**Vimal Raj**

GitHub:
https://github.com/Vimal-AFK
