package ch05_inheritance;

public class Animal {
    private String name;
    private String feed;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFeed() {
        return feed;
    }

    public void setFeed(String feed) {
        this.feed = feed;
    }

    public void eat(){
        System.out.printf("%s 이(가) %s 먹는중\n", name, feed);
    }
    public void bark(){
        System.out.printf("%s 이(가) 짖는중\n", name);
    }
    public void display(){
        System.out.printf("이름 : %s \n 나이 : %d", name, age);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", feed='" + feed + '\'' +
                ", age=" + age +
                '}';
    }
}
