
public class Main {

    public static void main(String[] args) {
        // You can use the main to test your classes!
        Item book = new Item("Lord of the rings", 4);
        Item phone = new Item("Nokia 3210", 2);
        Item brick = new Item("brick", 4);

        Suitcase suitcase = new Suitcase(4);
        System.out.println(suitcase);

        suitcase.addItem(book);//4
        System.out.println(suitcase);

        suitcase.addItem(phone);//2
        System.out.println(suitcase);

        suitcase.addItem(brick);//4
        System.out.println(suitcase);
    }

}
