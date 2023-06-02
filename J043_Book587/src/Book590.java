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

        Product<Tv, String> product1 = new Product<>();

        product1.setKind(new Tv());
        product1.setModel("스마트 TV");

        Tv tv = product1.getKind();
        String tvModel = product1.getModel();

    }
}