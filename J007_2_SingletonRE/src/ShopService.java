public class ShopService {
    
    // 싱글톤 객체 생성
    private static ShopService shopService = new ShopService(); // private가 맞나?

    // 외부에서 끌어올 수 있게
    public static ShopService getInstance() { // static?
        return shopService;
    }
}
