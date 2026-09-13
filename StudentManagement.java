import java.sql.*;
import java.util.Scanner;

public class StudentManagement {

    static final String URL = "jdbc:mysql://localhost:3306/student_db";
  static final String USER = "studentapp";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter MySQL root password: ");
        String password = sc.nextLine();

        try {
            Connection con = DriverManager.getConnection(URL, USER, password);

            System.out.println("\nConnected to MySQL successfully!");

            while (true) {
                System.out.println("\n--- Student Management System ---");
                System.out.println("1. Add Student");
                System.out.println("2. View Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                int choice = sc.nextInt();
                sc.nextLine();

                if (choice == 1) {
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter age: ");
                    int age = sc.nextInt();

                    String sql = "INSERT INTO students (name, course, age) VALUES (?, ?, ?)";
                    PreparedStatement ps = con.prepareStatement(sql);

                    ps.setString(1, name);
                    ps.setString(2, course);
                    ps.setInt(3, age);

                    ps.executeUpdate();
                    System.out.println("Student added successfully!");

                } else if (choice == 2) {

                    String sql = "SELECT * FROM students";
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(sql);

                    System.out.println("\nID | Name | Course | Age");
                    System.out.println("-------------------------");

                    while (rs.next()) {
                        System.out.println(
                            rs.getInt("id") + " | " +
                            rs.getString("name") + " | " +
                            rs.getString("course") + " | " +
                            rs.getInt("age")
                        );
                    }

                } else if (choice == 3) {

                    System.out.print("Enter student ID to update: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter new course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter new age: ");
                    int age = sc.nextInt();

                    String sql = "UPDATE students SET name=?, course=?, age=? WHERE id=?";
                    PreparedStatement ps = con.prepareStatement(sql);

                    ps.setString(1, name);
                    ps.setString(2, course);
                    ps.setInt(3, age);
                    ps.setInt(4, id);

                    ps.executeUpdate();
                    System.out.println("Student updated successfully!");

                } else if (choice == 4) {

                    System.out.print("Enter student ID to delete: ");
                    int id = sc.nextInt();

                    String sql = "DELETE FROM students WHERE id=?";
                    PreparedStatement ps = con.prepareStatement(sql);

                    ps.setInt(1, id);
                    ps.executeUpdate();

                    System.out.println("Student deleted successfully!");

                } else if (choice == 5) {

                    System.out.println("Program ended.");
                    con.close();
                    sc.close();
                    break;

                } else {
                    System.out.println("Invalid choice!");
                }
            }

        } catch (SQLException e) {
            System.out.println("Database connection failed!");
            System.out.println(e.getMessage());
        }
    }
}