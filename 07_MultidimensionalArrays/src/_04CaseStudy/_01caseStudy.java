package _04CaseStudy;

public class _01caseStudy {
    public static void main(String[] args) {
        char[][] answers = {
        {'A','B','C','D','A','B','C','D','A','B'}, // Student 1
        {'B','C','D','A','B','C','D','A','B','C'}, // Student 2
        {'C','D','A','B','C','D','A','B','C','D'}, // Student 3
        {'D','A','B','C','D','A','B','C','D','A'}, // Student 4
        {'A','A','B','B','C','C','D','D','A','B'}, // Student 5
        {'B','B','C','C','D','D','A','A','B','C'}, // Student 6
        {'C','C','D','D','A','A','B','B','C','D'}, // Student 7
        {'D','D','A','A','B','B','C','C','D','A'}, // Student 8
        {'A','B','A','B','C','D','C','D','A','B'}, // Student 9
        {'B','C','B','C','D','A','D','A','B','C'}  // Student 10
        };
        
        char[] key = {'A','B','C','D','A','B','C','D','A','B'};

        for(int r = 0; r < answers.length; r++){
            int correctCount = 0;
            for(int c = 0; c < answers[r].length; c++){
                if(answers[r][c] == key[c]){
                    correctCount++;
                }
            }

            System.out.println("Student "+r+"'s correct count is:"+correctCount);
        }

    }
}
