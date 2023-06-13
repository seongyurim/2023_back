import java.util.LinkedList;
import java.util.Queue;

public class Book694 {
    
    public static class Message {
        public String command;
        public String to;

        public Message() {
            command = "";
            to = "";
        }

        public Message(String command, String to) {
            this.command = command;
            this.to = to;
        }
    }

    public static void main(String[] args) {
        
        Queue<Message> messageQueue = new LinkedList<>();
        
        messageQueue.offer(new Message("sendMail", "홍길동"));
        messageQueue.offer(new Message("sendSMS", "신지우"));
        messageQueue.offer(new Message("sendKakaotalk", "김자바"));

        while(!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();

            switch (message.command) {
                case "sendMail":
                    System.out.println(message.to + "님에게 메일을 보냅니다.");
                break;
                
                case "sendSMS":
                    System.out.println(message.to + "님에게 SMS를 보냅니다.");
                break;

                case "sendKakaotalk":
                    System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
                break;
            }
        }
    }
}
