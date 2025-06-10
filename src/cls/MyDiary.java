package cls;
// 클래스
// 제목(문자열), 날짜(문자열), 내용(문자열)
public class MyDiary {
    private String sub;
    private String date;
    private String content;

    public MyDiary(){
        sub = "";
        date = "";
        content = "";
    }

    public MyDiary(String sub, String date, String content){
        this.sub = sub;
        this.date = date;
        this.content = content;
    }

    public void setSub(String sub) {this.sub = sub;}
    public String getSub() {return sub;}

    public void setDate(String date) {this.date = date;}
    public String getDate() {return date;}

    public void setContent(String content) {this.content = content;}
    public String getContent() {return content;}

    @Override
    public String toString() {
        return String.format("**오늘의 일기**\n제목 : %s\n날짜 : %s\n내용 : %s", sub, date, content);
    }

    @Override
    public boolean equals(Object obj) {
        if ( !(obj instanceof MyDiary) )
            return false;
        MyDiary target = (MyDiary) obj;
        return getSub().equals(target.getSub()) &&
                getDate().equals(target.getDate()) &&
                getContent().equals(target.getContent());
    }
}


