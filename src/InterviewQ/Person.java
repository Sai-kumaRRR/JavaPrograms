package InterviewQ;

public class Person{
    public String name;
    public int age;
    public static String address;

    public static void main(String[] args) {
        Static johan =new Static();
        johan.name = "johan";
        johan.age = 35;
        johan.address = "101MainSt";
        System.out.println(johan.name);
        System.out.println(johan.age);
        System.out.println(johan.address);

        Static smith = new Static();
        System.out.println(smith.name);
        System.out.println(smith.age);
        System.out.println(smith.address);

    }
}

