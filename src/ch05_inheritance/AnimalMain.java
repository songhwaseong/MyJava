package ch05_inheritance;

public class AnimalMain {
    static void main(String[] args) {
        Dog retriever = new Dog();
        retriever.setName("김리트리버");
        retriever.setAge(3);
        retriever.setGuide(false);
        retriever.setFeed("건식");
        retriever.bark();
        retriever.eat();
        retriever.display();
        System.out.println(retriever.toString());
        System.out.println("------------------");

        Dog maltese = new Dog();
        maltese.setName("이말티즈");
        maltese.setAge(5);
        maltese.setGuide(true);
        maltese.setFeed("습식");
        maltese.bark();
        maltese.eat();
        maltese.display();

        System.out.println("------------------");
        Cat persian = new Cat();
        persian.setName("김페리스안");
        persian.setAge(5);
        persian.setIndoor(false);
        persian.setFeed("습식");
        persian.bark();
        persian.eat();
        persian.display();

        System.out.println("------------------");
        Cat siamese = new Cat();
        siamese.setName("이샴");
        siamese.setAge(3);
        siamese.setIndoor(true);
        siamese.setFeed("건식");
        siamese.bark();
        siamese.eat();
        siamese.display();
        System.out.println("------------------");

    }
}
