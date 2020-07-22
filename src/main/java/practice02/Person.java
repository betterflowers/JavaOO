package practice02;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String introduce(){
        String showName = "My name is "+this.name+". ";
        String showAge = "I am "+this.age+" years old.";
        String totalString = showName+showAge;
        return totalString;
    }
}
