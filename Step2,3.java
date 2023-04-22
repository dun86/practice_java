int age = 27;

String name = "John";

int age = 20;

if (age >= 20) {
    System.out.println("You are an adult.");
} else {
    System.out.println("You are not an adult yet.");
}


for (int i = 0; i < 5; i++) {
    System.out.println("The value of i is: " + i);
}




int[] numbers = {1, 2, 3, 4, 5};


List<String> names = new ArrayList<String>();
names.add("John");
names.add("Mary");
names.add("Tom");

/*クラスの宣言とインスタンス化について*/
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

Person person = new Person("John", 27);
person.sayHello();

/*継承の例*/

public class Student extends Person {
    String schoolName;

    public Student(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    public void study() {
        System.out.println("I am studying at " + schoolName + ".");
    }
}

Student student = new Student("Mary", 20, "ABC University");
student.sayHello();
student.study();

/*例外処理のコード*/
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("An error occurred: " + e.getMessage());
}
