/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/
import java.util.Scanner;
import java.io.IOException;

class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      System.out.println("1.Add new student");
      System.out.println("2.Display student list");
      System.out.println("3.Quit");
      Scanner scanner = new Scanner(System.in);
      int stud = scanner.nextInt();

      switch(stud)
        {
          case 1: 
            System.out.println("Enter student's name:");
            String name =  scanner.next();
            System.out.println("Enter student's age:");
            int age = scanner.nextInt();
            System.out.println("Enter student's last name:");
            String lastname = scanner.next();
            System.out.println("Enter student's address:");
            String address = scanner.next();
            s.addStudent(new Student (name,lastname,address,age));
            break;

          case 2:
            var students = s.getStudents();
            for(Student current : students) {
            System.out.println(current.ToString());}
            break;
            
         case 3:
            System.exit(0);
            break;
        }
  

      
    
    } catch (IOException e) {

    }
  }
}