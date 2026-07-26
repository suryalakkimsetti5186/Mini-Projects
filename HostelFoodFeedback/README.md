# Hostel Food Feedback System

A desktop-based **Hostel Food Feedback System** developed using **Java Swing**, **JDBC**, and **MySQL**. The application allows hostel students to submit feedback on meals through an intuitive graphical interface, with all feedback securely stored in a MySQL database.

---

## Features

* Student feedback form
* Meal selection dropdown
* Food rating system
* Comment section for detailed feedback
* MySQL database connectivity using JDBC
* Stores feedback securely in the database
* User-friendly Java Swing interface

---

## Technologies Used

* Java
* Java Swing
* JDBC
* MySQL
* IntelliJ IDEA

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
HostelFoodFeedback
│
├── src
│   ├── DBConnection.java
│   ├── FeedbackForm.java
│   └── Main.java
│
└── README.md
```

---

## Prerequisites

Before running the project, ensure you have:

* Java JDK 8 or later
* MySQL Server
* MySQL Connector/J (JDBC Driver)
* IntelliJ IDEA (or any Java IDE)

---

## How to Run

1. Install Java JDK and MySQL Server.
2. Create the `food_review` database.
3. Create the `feedback` table using the SQL script above.
4. Update the database credentials in `DBConnection.java`.
5. Add the MySQL Connector/J JAR file to the project.
6. Compile and run `Main.java`.
7. Submit feedback through the graphical interface.

---

## Future Improvements

* Admin dashboard to view all feedback
* Edit and delete feedback entries
* User login and authentication
* Meal-wise feedback analytics
* Search and filter feedback
* Export feedback reports

---

## Author

**Surya Lakkimsetti**

GitHub: https://github.com/suryalakkimsetti5186
