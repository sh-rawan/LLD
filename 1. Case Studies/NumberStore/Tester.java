package NumberStore;

public class Tester {
    public static void main(String[] args) {
        NumberStore numberStore1 = new NumberStore(new InsertOne(), new SearcherTwo());
        numberStore1.insert(3);
        numberStore1.insert(6);
        numberStore1.insert(2);
        numberStore1.insert(9);
        System.out.println(numberStore1.search(3));
        System.out.println(numberStore1.search(9));
        System.out.println(numberStore1.search(90));


        NumberStore numberStore2 = new NumberStore(new InsertTwo(), new SearcherOne());
        numberStore2.insert(3);
        numberStore2.insert(6);
        numberStore2.insert(2);
        numberStore2.insert(9);
        System.out.println(numberStore2.search(3));
        System.out.println(numberStore2.search(9));
        System.out.println(numberStore2.search(90));    }
}
