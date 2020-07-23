package practice04;

public class Worker extends Person{
    public Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {

        String basicInfo =super.introduce();
        String klassStr=" I am a Worker. I have a job.";
        String totalString = basicInfo+klassStr;
        return totalString;

    }
}
