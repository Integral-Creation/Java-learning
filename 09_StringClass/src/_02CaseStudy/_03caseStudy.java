package _02CaseStudy;

import java.util.Scanner;

public class _03caseStudy {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        
        String str = "<<ab<c";//scanner.next();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                sb.append(ch);
            }
            if(ch == '<'){
                if(sb.length() > 0){
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
            if(ch == '*'){
                sb.setLength(0);
            }
        }

        if(sb.length() == 0){
            System.out.println("EMPTY");
        }else{
            System.out.println(sb.toString());
        }
        scanner.close();
    }
}
