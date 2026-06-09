# Hostel Food Feedback System

A Java-based desktop application developed using Java Swing and MySQL to collect hostel food feedback from students.

---

## Features

- Student feedback form
- Meal selection dropdown
- Rating system
- Comment section
- MySQL database connectivity using JDBC
- Stores feedback into database

---

## Technologies Used

- Java
- Java Swing
- MySQL
- JDBC
- IntelliJ IDEA

---

## Database

### Database Name

```sql
food_review
```

### Table Structure

```sql
CREATE TABLE feedback (
    id INT AUTO_INCREMENT PRIMARY KEY,
    student_name VARCHAR(100),
    meal_type VARCHAR(50),
    rating INT,
    comment TEXT
);
```

---

## Project Structure

```text
src/
 ├── DBConnection.java
 ├── FeedbackForm.java
 └── Main.java
```

---

## How to Run

1. Install Java and MySQL
2. Create database and table
3. Add MySQL Connector/J jar
4. Run `FeedbackForm.java`

---

## Author

Surya
