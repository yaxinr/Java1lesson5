package Person;

/**
 * Created by grr on 04.03.2017.
 */
public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private String phonenumber;
    private int salary;
    private int age;

    public Person(String firstName, String lastName, String email,
                  String phonenumber, int salary, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phonenumber = phonenumber;
        this.salary = salary;
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void print(){
        System.out.println(
                "firstName: "+this.firstName +"; "
                        + "lastName: "+this.lastName +"; "
                        + "age: "+this.age +"; "
        );
    }

}
