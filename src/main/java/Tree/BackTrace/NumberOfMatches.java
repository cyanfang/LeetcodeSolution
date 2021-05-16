package src.main.java.Tree.BackTrace;

public class NumberOfMatches {
    int result=0;
    public int solution(int n){
        helper(n);
        return result;
    }
    public void helper(int n){
        if(n==2){
            result=result+1;
            return;
        }
        if(n==1){
            result=0;
            return;
        }
        int isSignle=n%2;
        n=n/2;
        result+=n;
        if(isSignle==1){
            n++;

        }
        helper(n);
    }

    public static void main(String[] args) {
        NumberOfMatches numberOfMatches=new NumberOfMatches();
        System.out.println(numberOfMatches.solution(14));
    }
}
