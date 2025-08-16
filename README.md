# Dhaka University Hall Management System

## Overview
The Dhaka University Hall Management System is a Java-based desktop application designed to manage student accommodations in university halls. Built using Java Swing for the graphical user interface, it provides functionalities for administrators and students to handle room assignments, complaints, appointments, and student data efficiently. The system supports user authentication, data persistence, and data export, ensuring a robust and user-friendly experience.

## Features
### Admin Features
- **Dashboard**: Displays key metrics such as total students, occupied rooms, total rooms, open complaints, and pending appointments.
- **Student Management**: Add, update, or delete student records, including details like ID, name, contact, distance from Dhaka, merit position, father's income, and department.
- **Room Management**: Add or delete rooms, specifying room numbers and capacities.
- **Complaint Management**: View and resolve student-submitted complaints.
- **Appointment Management**: Approve or reject student appointment requests.
- **Seat Allocation**: Automatically assign seats to unassigned students based on distance, merit, and income.
- **Data Export**: Export all system data (students, rooms, complaints, appointments) to a human-readable text file (`hall_management_export.txt`).

### Student Features
- **Dashboard**: View personal details, room assignment status, submitted complaints, and approved appointments.
- **Profile**: Display detailed student information, including ID, name, contact, distance, merit, income, department, and room number.
- **Complaint Submission**: Submit complaints with descriptions for administrative review.
- **Appointment Requests**: Request appointments with authorities, specifying date and time.
- **Seat Request**: Request a seat if not already assigned (pending admin allocation).

### General Features
- **User Authentication**: Supports admin and student roles with login and signup functionality.
- **Data Persistence**: Saves data (users, students, rooms, complaints, appointments) to binary `.dat` files for persistence across sessions.
- **Modern UI**: Uses a clean, modern design with the Roboto font, gradient backgrounds, and hover effects on buttons for an enhanced user experience.

## System Requirements
- **Java Runtime Environment (JRE)**: Java 8 or higher.
- **Operating System**: Windows, macOS, or Linux (any OS supporting Java).
- **Dependencies**: Java Swing (included in standard Java library).
- **Optional**: `du_logo.png` for logo display in the UI (if not present, defaults to text "DU Logo").

## Installation
1. **Clone or Download the Repository**:
   - Obtain the `Main.java` file or the project directory.
2. **Compile the Code**:
   - Ensure Java Development Kit (JDK) is installed.
   - Compile the program using:
     ```bash
     javac Main.java
     ```
3. **Run the Application**:
   - Execute the compiled program:
     ```bash
     java MainGUI
     ```
4. **Optional**: Place a `du_logo.png` file in the project directory for logo display in the UI.

## Usage
1. **Launch the Application**:
   - Run the program to open the login window.
2. **Login**:
   - **Admin Credentials**: Username: `admin`, Password: `admin123` (default).
   - **Student Credentials**: Use student ID (e.g., `S001`) and password (default: `pass123` for sample students).
3. **Signup (Students Only)**:
   - Click "Signup as Student" on the login screen.
   - Enter required details: Student ID (e.g., `S003`), name, contact (9-10 digits), district (for distance calculation), merit position (1-8000), father's monthly income, faculty, department, and password.
   - After successful signup, log in with the new credentials.
4. **Admin Interface**:
   - Navigate tabs (Dashboard, Students, Rooms, Complaints, Appointments) to manage data.
   - Use buttons to add/update/delete records, allocate seats, resolve complaints, approve/reject appointments, or export data.
5. **Student Interface**:
   - View dashboard, submit complaints, request appointments, or check profile details.
   - Request a seat if unassigned (admin will allocate based on criteria).
6. **Logout**:
   - Click the "Logout" button to return to the login screen.

## Data Persistence
- **Storage**: Data is stored in binary `.dat` files (`users.dat`, `students.dat`, `rooms.dat`, `complaints.dat`, `appointments.dat`) in the project directory.
- **Default Data**: If no `.dat` files exist, the system initializes with:
  - Admin user: `admin`/`admin123`.
  - Sample students: `S001`/`pass123` (John Doe, CSE) and `S002`/`pass123` (Jane Smith, EEE).
  - Sample rooms: `R101` (capacity 2), `R102` (capacity 2).
- **Export**: Admins can export data to a text file (`hall_management_export.txt`) in a comma-separated format for review or reporting.

## Code Structure
- **Classes**:
  - `User`: Represents a user with username, password, and role (admin or student).
  - `Student`: Stores student details (ID, name, contact, distance, merit, income, room, department).
  - `Room`: Manages room details (number, capacity, occupants).
  - `Complaint`: Tracks complaint details (ID, student ID, description, resolved status).
  - `Appointment`: Manages appointment requests (ID, student ID, authority, date, time, approval status).
  - `HallManagementSystem`: Core logic for data management, persistence, and seat allocation.
  - `SeatAllocator`: Handles automatic seat allocation based on distance, merit, and income.
  - UI Classes: `MainGUI`, `LoginPanel`, `SignupPanel`, `AdminDashboardPanel`, `StudentDashboardPanel`, `StudentProfilePanel`, `StudentComplaintPanel`, `StudentAppointmentPanel`, `StudentPanel`, `RoomPanel`, `AdminComplaintPanel`, `AdminAppointmentPanel`.
  - Table Models: `StudentTableModel`, `RoomTableModel`, `ComplaintTableModel`, `AppointmentTableModel` for JTable data binding.
  - `ModernTableCellRenderer`: Custom renderer for styled tables.
- **Key Methods**:
  - `saveData()`: Serializes data to `.dat` files.
  - `loadData()`: Deserializes data from `.dat` files or initializes defaults.
  - `exportData()`: Exports data to a human-readable text file.
  - `assignSeat()`/`unassignSeat()`: Manages room assignments.
  - `submitComplaint()`/`submitAppointmentRequest()`: Handles student submissions.
  - `authenticate()`: Validates user credentials.

## Notes
- **Validation**: The signup process enforces input validation (e.g., ID format `S\d+`, contact 9-10 digits, merit 1-8000, non-negative distance/income).
- **Seat Allocation**: Prioritizes students by distance (descending), then merit, then income.
- **UI Design**: Uses Roboto font, teal color scheme (#26A69A), and gradient backgrounds for a modern look.
- **Error Handling**: File operations and user inputs are handled with try-catch blocks and validation dialogs.
- **Future Improvements**:
  - Add support for editing complaints or canceling appointments.
  - Implement password hashing for security.
  - Enhance error reporting for file operations.
  - Add multi-threading safeguards for concurrent data access.

## Sample Data
- **Admin Login**: Username: `admin`, Password: `admin123`
- **Student Logins**:
  - Username: `S001`, Password: `pass123` (John Doe, CSE, 50km, merit 500, income 50000)
  - Username: `S002`, Password: `pass123` (Jane Smith, EEE, 30km, merit 300, income 30000)
- **Rooms**: `R101` (capacity 2), `R102` (capacity 2)

## Troubleshooting
- **Login Failure**: Ensure correct credentials or check `.dat` files for corruption.
- **File Errors**: Verify write permissions in the project directory.
- **UI Issues**: Ensure Java Swing is supported and the Roboto font is available (or fallback fonts work).
- **Missing Logo**: Place `du_logo.png` in the project directory or expect "DU Logo" text.

## License
This project is for educational purposes and not licensed for commercial use. Contact the repository owner for permissions or modifications.
