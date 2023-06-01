public class Main {

    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getInstance();
        System.out.println(singleTon);
        SingleTon singleTon1 = SingleTon.getInstance();
        System.out.println(singleTon1.hashCode());
        SingleTon singleTon2 = SingleTon.getInstance();
        System.out.println(singleTon2.hashCode());
        SingleTon singleTon3 = SingleTon.getInstance();
        System.out.println(singleTon3.hashCode());
    }


}
