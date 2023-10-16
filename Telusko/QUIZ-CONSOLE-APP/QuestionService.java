import java.util.Scanner;

public class QuestionService {
    
    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService() {
        questions[0] = new Question(1,"Size of int","1","3","4","5","1");
        questions[1] = new Question(2,"Size of double","1","3","4","5","2");
        questions[2] = new Question(3,"Size of large","1","3","4","5","3");
        questions[3] = new Question(4,"Size of float","1","3","4","5","4");
        questions[4] = new Question(5,"Size of string","1","3","4","5","2");

    }


    public void playQuiz() 
    {
        int i = 0;
        for(Question q : questions) {
            System.out.print("Question no: "+ q.getId()+". ");            
            System.out.println(q.getQuestion()+ " ");
            System.out.print(q.getOpt1()+ " ");
            System.out.print(q.getOpt2()+ " ");
            System.out.print(q.getOpt3()+ " ");
            System.out.print(q.getOpt4()+ " ");
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }

        for(String s : selection) {
            System.out.println(s);
        }
    }

    public void printScore() {
        int score =0;
        for(int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];

            if(actualAnswer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your score is : " + score);

    }

}
