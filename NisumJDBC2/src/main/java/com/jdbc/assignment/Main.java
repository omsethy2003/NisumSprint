package com.jdbc.assignment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Connect to DB");
            System.out.println("2. Insert (Statement)");
            System.out.println("3. Retrieve Students");
            System.out.println("4. Insert (PreparedStatement)");
            System.out.println("5. Update Student Name");
            System.out.println("6. Delete Student");
            System.out.println("7. Search Students by Name");
            System.out.println("8. Transaction Example");
//            System.out.println("9. Call Stored Procedure");
            System.out.println("10. Handle Exceptions");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    Q1_ConnectDB.connect();
                    break;
                case 2:
                    System.out.print("Enter ID: ");
                    int id2 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name2 = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age2 = sc.nextInt();
                    Q2_InsertUsingStatement.insert(id2, name2, age2);
                    break;
                case 3:
                    Q3_RetrieveStudents.retrieve();
                    break;
                case 4:
                    System.out.print("Enter ID: ");
                    int id4 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name4 = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age4 = sc.nextInt();
                    Q4_InsertUsingPreparedStatement.insert(id4, name4, age4);
                    break;
                case 5:
                    System.out.print("Enter ID: ");
                    int id5 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();
                    Q5_UpdateStudent.update(id5, newName);
                    break;
                case 6:
                    System.out.print("Enter ID to delete: ");
                    int id6 = sc.nextInt();
                    Q6_DeleteStudent.delete(id6);
                    break;
                case 7:
                    System.out.print("Enter name keyword: ");
                    String keyword = sc.nextLine();
                    Q7_SearchStudentLike.search(keyword);
                    break;
                case 8:
                    Q8_TransactionExample.execute();
                    break;
//                case 9:
//                    System.out.print("Enter ID for stored procedure: ");
//                    int id9 = sc.nextInt();
//                    Q9_CallStoredProcedure.call(id9);
//                    break;
                case 10:
                    Q10_HandleExceptions.execute();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        sc.close();
    }
}
