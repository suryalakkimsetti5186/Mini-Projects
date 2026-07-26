# Online Quiz System

A desktop-based Online Quiz System developed using **Java Swing** and **MySQL**. The application allows students to take quizzes and administrators to manage questions through a graphical user interface.

## Features

### Student
- Student Login
- Attempt quizzes
- Automatic score calculation
- View quiz results

### Admin
- Admin Login
- Add questions
- View questions
- Delete questions
- Manage question database

## Technologies Used

- Java
- Java Swing
- JDBC
- MySQL
- IntelliJ IDEA

## Project Structure

```
Quiz_system
│
├── src
│   ├── AddQuestions.java
│   ├── AdminLogin.java
│   ├── AdminPanel.java
│   ├── DBConnection.java
│   ├── DeleteQuestion.java
│   ├── Homepage.java
│   ├── Main.java
│   ├── QuizForm.java
│   ├── ResultForm.java
│   ├── StudentLogin.java
│   ├── StudentResults.java
│   └── ViewQuestions.java
│
├── .gitignore
└── README.md
```

## Database

Create a MySQL database before running the project.

Update the database credentials inside `DBConnection.java` according to your local MySQL setup.

## How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Create the required MySQL database.
4. Update the database connection in `DBConnection.java`.
5. Run `Main.java`.

## Future Improvements

- Timer for quizzes
- Multiple-choice support
- Difficulty levels
- Leaderboard
- Password encryption
- Question categories

## Author

**Surya Lakkimsetti**