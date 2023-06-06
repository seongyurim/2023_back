public class Book590 {

    public static class Product<K, M> {
        private K kind;
        private M model;

        public K getKind() {return this.kind;}
        public M getModel() {return this.model;}
        public void setKind(K kind) {this.kind = kind;}
        public void setModel(M model) {this.model = model;}
        
    }

    public static class Tv {}
    public static class Car {}

    public static void main(String[] args) throws Exception {

        // K는 Tv로, M은 Strin으로 생성
        Product<Tv, String> product1 = new Product<>();

        // Setter 매개값은 반드시 Tv와 String을 제공
        product1.setKind(new Tv());
        product1.setModel("스마트 TV");

        // Getter 리턴값은 Tv와 String이 된다.
        Tv tv = product1.getKind();
        String tvModel = product1.getModel();

        /////////////////////////////////////////////////////////

        Product<Car, String> product2 = new Product<>();

        product2.setKind(new Car());
        product2.setModel("KIA 자동차");

        Car car = product2.getKind();
        String carModel = product2.getModel();

    }
}