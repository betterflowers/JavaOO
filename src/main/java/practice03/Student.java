package practice03;

public class Student extends Person{
    protected int klass;

    public int getKlass() {
        return klass;
    }

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        String klassStr="I am a Student. I am at Class "+klass+".";
        return klassStr;
    }


}
