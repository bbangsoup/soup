package HY_Test;

public class SpeakDoll {
    private String message = "달링 알라뷰";

    void setMassage(String msg){
        message = msg;
    }

    String getMessage(){
        return message;
    }

    @Override
    public String toString() {
        return String.format("인형 왈 : %s", message);
    }
}
