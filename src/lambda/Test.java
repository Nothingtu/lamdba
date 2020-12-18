package lambda;

public class Test {
    public static void main(String[] args) {
        A a = new A(){
            public void test(String str){
                System.out.println("我是A的匿名内部类的test方法"+str);
            }
        };
        a.test("atest");

        A b = (str) -> System.out.println("我是B的匿名内部类的test方法"+str);
        b.test("btest");

        AA aa = new AA(){
            public Person create(int age ,String name){
                return new Person(age,name);
            }
        };
        aa.create(18,"zhangsan");

        AA bb = Person::new;
        bb.create(12,"bbtest");

    }
}
