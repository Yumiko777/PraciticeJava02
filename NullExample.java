class StudentCard {
    int id;
    String name;
}

public class NullExample {
    public static void main(String[] args) {
        // インスタンスの配列の宣言
        StudentCard[] cards = new StudentCard[3];
        // 新しいインスタンスを生成し、インスタンス変数id nameに値を代入する
        cards[1] = new StudentCard();
        cards[1].id = 1235;
        cards[1].name = "佐藤";

        for (int i = 0; i < 3; i++) {
            if (cards[i] == null) {
                System.out.println("cards[" + i + "] は参照がありません");
            } else {
                System.out.println("cards[" + i + "] の" + "idは" + cards[i].id + "、nameは" + cards[i].name);
            }
        }
    }   
}
