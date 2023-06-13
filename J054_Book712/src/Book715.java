public class Book715 {

    //// 익명 구현 객체를 람다식으로 대체해보기

    public static class Button {

        // 정적 멤버 인터페이스
        @FunctionalInterface
        public static interface ClickListener {
            void onClick();
        }

        // 필드
        private ClickListener clickListener;

        // 메소드
        public void setClickListener(ClickListener clickListener) {
            this.clickListener = clickListener;
        }

        public void click() {
            this.clickListener.onClick();
        } 
    }

    public static void main(String[] args) throws Exception {
        
        // Ok 버튼 객체 생성 ///////////////////////
        Button btnOk = new Button();

        // Ok 버튼 객체에 람다식(ClickListener 익명 구현 객체) 주입
        btnOk.setClickListener(() -> System.out.println("Ok 버튼을 클릭했습니다."));

        // Ok 버튼 클릭하기
        btnOk.click();

        // Cancel 버튼 객체 생성 ///////////////////
        Button btnCancel = new Button();

        // Cancel 버튼 객체에 람다식(ClickListener 익명 구현 객체) 주입
        btnCancel.setClickListener(() -> System.out.println("Cancel 버튼을 클릭했습니다."));

        // Cancel 버튼 클릭하기
        btnCancel.click();
    }
}
