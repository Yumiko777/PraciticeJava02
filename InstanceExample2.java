class StudentCard {
    int id;
    String name;
}

public class InstanceExample2 {
    public static void main(String[] args) {
        StudentCard a = new StudentCard();
        StudentCard b = new StudentCard();
        StudentCard c = b;
        a.id = 1234;
        a.name = "鈴木";
        b.id = 1235;
        b.name = "佐藤";

        System.out.println("aのidは" + a.id + ",nameは" + a.name);
        System.out.println("aのidは" + b.id + ",nameは" + b.name);
        System.out.println("aのidは" + c.id + ",nameは" + c.name);
        System.out.println("---------------------");

        c.id = 1236;
        c.name = "山田";

        System.out.println("aのidは" + a.id + ",nameは" + a.name);
        System.out.println("aのidは" + b.id + ",nameは" + b.name);
        System.out.println("aのidは" + c.id + ",nameは" + c.name);
    }
    
}
