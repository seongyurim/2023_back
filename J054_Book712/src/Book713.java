public class Book713 {

    //// 매개변수가 없는 람다식
    
    @FunctionalInterface
    public static interface Workable {
        void work();
    }

    public static class Person {
        public void action(Workable workable) {
            workable.work();
        }
    }

    public static void main(String[] args) {
        
        Person person = new Person();

        // 실행문이 두 줄 이상인 경우 중괄호 필요
        person.action(() -> {
            System.out.println("출근을 합니다.");
            System.out.println("프로그래밍을 합니다.");
        });

        // 실행문이 한 줄인 경우 중괄호 생략
        person.action(() -> System.out.println("퇴근합니다."));
    }
}
