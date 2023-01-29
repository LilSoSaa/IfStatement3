import java.util.Random;

public class Student {

    private String name;
    private  int age;
    public Student(String studentName, int studentAge){
        name = studentName;
        age = studentAge;

    }
public void guessingAge(){
    Random rand= new Random();
    int randomAge= rand.nextInt(35);
    System.out.println("I generate the random age "+ randomAge + " for the student "+ name);


    if(randomAge== age){
        System.out.println("The random value is equal to " + name +" 's age");
    } else if (randomAge>age){
        System.out.println("The random value is bigger than " + name +" 's age");
    }else {
        System.out.println("The random value is lower than " + name +" 's age");
    }


}






}
