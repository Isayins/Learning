package excpetion;

public class Teacher {
    public void checkScore(int score) throws ScoreException{
        if (score < 0 || score > 100){
            throw new ScoreException("你给的成绩有误,分数应该在0-100之间");
        }else {
            System.out.println("你给的成绩正常");
        }
    }

    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        try {
            teacher.checkScore(120);
        } catch (ScoreException e) {
            e.printStackTrace();
        }
    }
}
