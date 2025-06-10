package cls;
// 클래스
// 직업(문자열), 스킬(문자열), HP(int), MP(int)
public class MyDF {
    private String job;
    private String skill;
    private int hp;
    private int mp;

    MyDF (){
        job = "";
        skill = "";
        hp = 100;
        mp = 100;
    }

    MyDF (String job, String skill, int hp, int mp){
        this.job = job;
        this.skill = skill;
        this.hp = hp;
        this.mp = mp;
    }

    public void setJob(String job){this.job = job;}
    public String getJob(){return job;}

    public void setSkill(String skill){this.skill = skill;}
    public String getSkill(){return skill;}

    public void setHp(int hp){this.hp = hp;}
    public int getHp(){return hp;}

    public void setMp(int mp){this.mp = mp;}
    public int getMp(){return mp;}

    @Override
    public String toString() {
        return String.format("**캐릭정보는 다음과 같습니다.**\n직업 : %s\n스킬 : %s\n체력 : %d\n마력 : %d",job,skill,hp,mp);
    }
}
