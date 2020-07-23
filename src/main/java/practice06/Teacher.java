package practice06;

public class Teacher extends Person{
    private Integer klass;

    public Integer getKlass() {
        return klass;
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass=klass;
    }

    public Teacher(String name, int age) {
        super(name,age);
    }

    @Override
    public String introduce() {
        if(klass == null)
        {
            String teacherNoKlass =" I am a Teacher. I teach No Class.";
            return super.introduce()+teacherNoKlass;

        }else{
            String teacherinfo = " I am a Teacher. I teach Class "+this.klass+".";
            return super.introduce()+teacherinfo;
        }

    }
}
