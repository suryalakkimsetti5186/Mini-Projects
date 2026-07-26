# Contact Management System

A console-based **Contact Management System** developed in **C++** using a **Singly Linked List** to store and manage contact information dynamically. This project demonstrates the implementation of fundamental data structures, object-oriented programming, and dynamic memory allocation.

---

## Features

* Add new contacts
* Display all contacts
* Search contacts by name
* Delete contacts by name
* Dynamic storage using a Singly Linked List
* User-friendly menu-driven interface

---

## Technologies Used

* C++
* Object-Oriented Programming (OOP)
* Singly Linked List
* Dynamic Memory Allocation
* Standard Library (`iostream`, `string`)

---

## Data Structure Used

The project uses a **Singly Linked List** where each node stores:

* Contact Name
* Contact Number
* Pointer to the next contact

This allows contacts to be dynamically added and removed without requiring a fixed-size array.

---

## Project Structure

```text
ContactManagementSystem
├── contact_management.cpp
└── README.md
```

---

## Operations

### 1. Insert Contact

* Add a new contact by entering the contact name and phone number.

### 2. Display Contacts

* Display all saved contacts.

### 3. Search Contact

* Search for a contact using the contact name.

### 4. Delete Contact

* Delete a contact by entering its name.

### 5. Exit

* Exit the application.

---

## Concepts Demonstrated

* Classes and Objects
* Constructors
* Pointers
* Singly Linked List
* Dynamic Memory Allocation (`new` and `delete`)
* Traversing Linked Lists
* Searching in Linked Lists
* Deleting Nodes
* Menu-Driven Programming

---

## How to Compile and Run

### Compile

```bash
g++ contact_management.cpp -o ContactManagementSystem
```

### Run

```bash
./ContactManagementSystem
```

> On Windows (MinGW):

```bash
g++ contact_management.cpp -o ContactManagementSystem.exe
ContactManagementSystem.exe
```

---

## Sample Menu

```text
------ CONTACT MANAGEMENT SYSTEM ------

1. Insert Contact
2. Display Contacts
3. Search Contact
4. Delete Contact
5. Exit

Enter choice:
```

---

## Future Improvements

* Update existing contact details
* Sort contacts alphabetically
* Prevent duplicate contacts
* Validate phone numbers
* Save contacts to a file
* Load contacts from a file
* Search by phone number
* Add email and address fields

---

## Author

**Surya Lakkimsetti**

GitHub: https://github.com/suryalakkimsetti5186
