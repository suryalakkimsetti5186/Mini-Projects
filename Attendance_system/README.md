# Attendance Management System

A Java Swing application that manages student attendance records using JDBC and MySQL.

## Features

- Add student details
- Calculate attendance percentage
- Store data in MySQL database
- Display records in a table
- Simple GUI built with Java Swing

## Technologies Used

- Java
- Swing
- JDBC
- MySQL

## Project Structure

```
Attendance_system
│
├── src
│   ├── DBConnection.java
│   ├── Main.java
│   └── Studentform.java
```

## How to Run

1. Create the MySQL database and `student` table.
2. Update the database credentials in `DBConnection.java`.
3. Add the MySQL Connector/J JAR to the project.
4. Compile and run `Main.java`.

#Overall Project Flow

Enter Details
      │
      ▼
+-------------------------+
| Id        : 101         |
| Name      : Surya       |
| Subject1  : 90          |
| Subject2  : 85          |
| Subject3  : 88          |
+-------------------------+
      │
      ▼
Calculate Total
      │
      ▼
Average = 87.67
      │
      ▼
Submit
      │
      ├──► Add row to JTable
      ├──► Save to MySQL
      └──► Clear all fields
## Author

SURYA LAKKIMSETTI