# Employee Search — Project Documentation

## 1. Project Overview

This project is a Java Swing application for the CSCI 4055 Database Project. It allows users to load departments and projects from a database using the COMPANY schema and search for employees using selected filters.

## 2. GUI Development and Tools

The group cloned the starter project from the professor's GitHub repository.

According to the assignment instructions, the original GUI was created using Eclipse WindowBuilder. The group modified the existing Java Swing source code to implement database functionality.

Tools and technologies used:
- Java and Java Swing
- JDBC and MariaDB Java Client
- XAMPP and MariaDB
- Java Development Kit (JDK)
- Terminal
- Git and GitHub

## 3. Database Setup

The project uses the COMPANY database schema provided for the assignment.

The database was created and populated using the professor's SQL script and XAMPP/MariaDB.

The application uses JDBC to connect to MariaDB.

Database credentials are configured using the `EMPLOYEE_DB_USER` and `EMPLOYEE_DB_PASSWORD` environment variables.

## 4. Application Features

### Fill Button
Loads departments and projects from the database entered in the Database field. Refreshes existing lists and displays an error if the database cannot be opened.

### Search Button
Searches employees using selected departments and projects. Supports multiple selections and prevents duplicate results on repeated searches.

### Not Checkboxes
Department Not excludes employees in selected departments. Project Not excludes employees working on selected projects.

### Clear Button
Clears employee results, department and project selections, and both Not checkboxes. The department and project lists remain populated.

### Scrollable Lists
All three lists—Department, Project, and Employee—support scrolling.

## 5. Testing

The following tests were completed successfully:

1. Fill loads departments and projects.
2. Multiple department and project selections return expected employees.
3. Repeated searches do not produce duplicates.
4. Project Not returns expected employees.
5. Both Not checkboxes work together.
6. Clear resets results, selections, and checkboxes.
7. Invalid database names trigger an error popup.
8. All three lists are scrollable.

## 6. Running the Application

Requirements:
- Java JDK
- XAMPP with MariaDB running
- COMPANY database imported
- MariaDB JDBC driver JAR

Set database credentials in Terminal:

`export EMPLOYEE_DB_USER=root`

`export EMPLOYEE_DB_PASSWORD=''`

Compile the application:

`javac -cp /path/to/mariadb-java-client-4.0.0.jar *.java`

Run the application:

`java -cp ".:/path/to/mariadb-java-client-4.0.0.jar" EmployeeSearchFrame`

Replace the example JAR path with the actual driver location. Database credentials may differ on other computers.

## 7. Version Control

Git and GitHub were used for group collaboration. Changes were developed on branches and merged into the main branch through pull requests.

## 8. Conclusion

The application implements the required database loading, employee searching, filtering, clearing, scrolling, and error-handling functionality.

## GitHub Repository

Project repository:
https://github.com/dhakalsamir/CSCI-4055-Employee-Search-group-project
