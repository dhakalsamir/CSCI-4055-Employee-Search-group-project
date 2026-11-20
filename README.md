# Employee Search — Database Project

## Overview

This is a Java Swing application developed for the CSCI 4055 Database Project.

The application connects to a database using the COMPANY schema and allows users to search for employees based on department and project selections.

The project was developed by a group of three students using the starter project provided by Dr. Smith.

## Features

- Load departments and projects from a database.
- Select multiple departments and projects.
- Search for matching employees.
- Apply Department Not and Project Not filters.
- Clear employee results and selections.
- Display database connection errors.
- Scroll through Department, Project, and Employee lists.

## Technologies Used

- Java
- Java Swing
- JDBC
- MariaDB JDBC Driver
- XAMPP / MariaDB
- Git and GitHub
- Java Development Kit (JDK)
- Terminal
- Codex (development assistance)

## GUI Development

The original Java Swing GUI was provided in the professor's GitHub starter repository.

According to the assignment instructions, the starter GUI was created using Eclipse WindowBuilder.

Our group cloned the repository and modified the existing Java source code to implement database connectivity and application functionality.

## Project Files

- `EmployeeSearch.java` — employee search and database query logic.
- `EmployeeSearchFrame.java` — graphical user interface and button actions.
- `DOCUMENTATION.md` — implementation, setup, and testing documentation.

## Setup

1. Install XAMPP and start MariaDB.
2. Create a database using the COMPANY schema.
3. Import the professor's `buildCOMPANYdb.sql` script.
4. Download the MariaDB JDBC driver.
5. Configure database credentials.
6. Compile and run the Java application.

See `DOCUMENTATION.md` for more information.
