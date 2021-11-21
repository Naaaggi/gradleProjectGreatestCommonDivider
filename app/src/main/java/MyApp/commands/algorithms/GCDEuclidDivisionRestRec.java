package MyApp.commands.algorithms;

public class GCDEuclidDivisionRestRec {
    static public int getGCD(int a, int b){
        if (b==0)
            return a;
        return getGCD(b, a%b);
    }
}
