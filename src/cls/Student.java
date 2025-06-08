package cls;

public class Student extends Person{

    private String school;
    private int grade;

    // 생성자 : 이름, 나이, 성별, 학교
    // grade 는 무조건 1로 설정

    public Student(String name, int age, String gender, String school){
        super(name, age);   // 부모 클래스의 생성자 호출
        setGender(gender);  // Person 클래스에 구현해 놓은 setGender 메소드를 이용하여 설정
        this.school = school;
        this.grade = 1;
    }

    @Override   // 해당 메소드를 재정의 한다는 뜻, 메소드 오버라이드
    public void introduce() {
        super.introduce();  // 부모 클래스(Person)에서 정의된 introduce()메소드를 호출
        System.out.printf("학교는 %s에 다니고 있습니다.\n", school);
    }

    // Object class 의 equals 를 재정의함.
    @Override
    public boolean equals(Object obj) {
        // 매개변수 obj가 Student 클래스로부터 생성된 인스턴스인지 먼저 검사
        if ( !(obj instanceof Student) )
            return false;

        Student target = (Student) obj;     // 형변환 Object -> Student

        return getName().equals(target.getName()) &&
                getAge() == target.getAge() &&
                getGender().equals(target.getGender()) &&
                school.equals(target.school) &&
                grade == target.grade;


    }
}


