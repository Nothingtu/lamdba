package lambda;

public class Person {
    public int age;
    public String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println(age + "--"+name+"被创建了");
    }
}
