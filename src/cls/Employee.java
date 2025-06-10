package cls;

// 직원(Employee) 클래스를 만드세요
// Person 클래스로부터 상송받아서 만듭니다.
// 회사명(문자열), 직급(문자열), 부서(문자열)를 추가 필드로 정의하세요
// 각각의 필드에 대해서 setter와 getter를 정의하세요
// introduce 메소드를 재정의(Override)하여 이름, 회사, 부서, 직급 순으로 출력되로독 정의하세요

public class Employee extends Person{

    private String company;
    private String part;
    private String rank;

    Employee(){

    }

    Employee(String name, int age, String company, String part, String rank){
        super(name, age);
        this.company = company;
        this.part = part;
        this.rank = rank;
    }

    Employee(String company, String part, String rank){
        this.company = company;
        this.part = part;
        this.rank = rank;
    }

    public void setCompany(String company) {this.company = company;}
    public String getCompany() {return company;}

    public void setPart(String part) {this.part = part;}
    public String getPart() {return part;}

    public void setRank(String rank) {this.rank = rank;}
    public String getRank() {return rank;}

    @Override
    public void introduce() {
        System.out.printf("%s, %s, %s, %s\n",getName(), company, part, rank);
    }
}
