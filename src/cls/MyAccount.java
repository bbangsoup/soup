package cls;

// 사용자 아이디(문자열)와 비밀번호(문자열)를 필드로 갖는 class MyAccount 클래스를 정의하고
// 기본 생성자에서는 아이디 = "", 비밀번호 = "" 로 정의하고,
// 추가 생성자에서는 아이디와 비밀번호를 매개변수로 입력받아 필드에 대입하도록 정의하세요


public class MyAccount {
    private String id;      // 사용자 아이디
    private String password;      // 비밀번호

    public MyAccount(){
        id = "";
        password = "";
    }

    public MyAccount(String id, String pw){
        this.id = id;
        this.password = pw;
    }

    // id, password 필드에 대해서 각각 setter와 getter를 정의하세요
    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return this.id;
    }

    public void setPassword(String pw){
        this.password = pw;
    }

    public String getPassword(){
        return this.password;
    }

    // toSting 메소드를 재정의(Override)하세요
    // ID : xxxx
    // PASSWORD : xxxx
    @Override
    public String toString() {
        return String.format("ID : %s\n PASSWORD : %s", id, password);
    }

    // equals 메소드를 재정의하여 id와 password가 완전히 동일하면 true를 반환하고 아니면 false를 반환하도록 정의하세요.
    @Override
    public boolean equals(Object obj) {
        if( !(obj instanceof MyAccount) )
            return false;

        MyAccount target = (MyAccount) obj;

        return getId().equals(target.getId()) &&
                getPassword().equals(target.getPassword());
    }
}