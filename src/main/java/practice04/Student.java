package practice04;

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
        String basicInfo =super.introduce();
        String infoStr=" I am a Student. I am at Class "+this.klass+".";
        String totalString = basicInfo+infoStr;
        return totalString;
    }
}
