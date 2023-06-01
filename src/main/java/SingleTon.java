public class SingleTon {

    private static SingleTon singleTon=null;

    public static synchronized SingleTon getInstance() {
        if(singleTon == null) {
            singleTon = new SingleTon();
        }
            return singleTon;

    }

}
