package DSDay3;

public class DupliMain{
    public static void main(String[] args) {
        DuplicateNodes d1= new DuplicateNodes();
        DuplicateNodes d2 = new DuplicateNodes();
        d1.insert(30);
        d1.insert(10);
        d1.insert(20);
        d1.insert(40);
        d1.insert(11);
        d1.insert(15);
//        d2.insert(11);
//        d2.insert(22);
//        d2.insert(33);
//        d2.insert(44);
       d1.display();

       d1.asc();
//        d1.display();



    }
}
