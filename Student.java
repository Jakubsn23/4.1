public class Student {

  private String Name;
  private String Lastname;
  private int Age;
  private String Address;
  private String Date;

  public Student(String name,String lastname,String address,int age,String date) {
    Name = name;
    Age = age;
    Address = address;
    Lastname = lastname;
    Date = date; 
  }

  public String GetName() {return Name;}
  public String GetLastname() {return Lastname;}
  public String GetAddress() {return Address;}
  public int GetAge() {return Age;}
  public String GetDate() {return Date;}

  public String ToString() {
    return Name + " " + Lastname + " " + Address + " " + Integer.toString(Age) + " " + Date;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 5) 
      return new Student("Parse Error","Parse Error","Parse Error",-1,"Parse Error");
    return new Student(data[0],data[1],data[2], Integer.parseInt(data[3]),data[4]);
  }
}