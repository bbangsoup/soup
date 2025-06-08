package clsex;

public class PeopleTester {
    public static void main(String[] args) {

       People [] myArr = new People[3]; // 배열을 만드는 것이이 인스턴스를 만드는 것이 아니다.


        myArr[0] = new American();
        myArr[1] = new Korean();
        myArr[2] = new Japanese();
//
//        for(Object obj : myArr){
//            People p = (People) obj;
//            p.say();
//        }

//        American p1 = new American();
//        Korean p2 = new Korean();
//        Japanese p3 = new Japanese();

//        p1.say();
//        p2.say();
//        p3.say();



        }

}

