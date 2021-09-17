class StudentCard {
    int id;
    String name;
}

public class ReferenceExample {
    // StudentCardクラスのインスタンスの参照をcardという名前の変数で受け取る
    static void printCardInfo(StudentCard card) {
        System.out.println("学生番号:" + card.id);
        System.out.println("氏名:" + card.name);
    }

    static void clearCardInfo(StudentCard card) {
        // インスタンス変数の値を変更する
        card.id = 0;
        card.name = "未定";
    }

    public static void main(String[] args) {
        // 新しいインスタンスを生成し、インスタンス変数id nameの値を設定する
        StudentCard a = new StudentCard();
        a.id = 1234;
        a.name = "鈴木";

        printCardInfo(a);
        clearCardInfo(a);
        printCardInfo(a);
    }
}
