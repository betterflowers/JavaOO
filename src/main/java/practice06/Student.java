package practice06;

public class Student extends Person{
    protected int klass;

    public int getKlass() {
        return klass;
    }

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public String basicInfo(){
        String basicInfo =super.introduce();
        return basicInfo;
    }

    @Override
    public String introduce() {
        String studentStr=" I am a Student. I am at Class "+this.klass+".";
        return basicInfo()+studentStr;
    }
}
