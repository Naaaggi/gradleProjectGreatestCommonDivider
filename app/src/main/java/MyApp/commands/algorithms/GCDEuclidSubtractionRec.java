package MyApp.commands.algorithms;

public class GCDEuclidSubtractionRec {
    static public int getGCD(int a, int b){
        if (b == 0) return a;
        else if (a == 0) return b;
        else if (a > b) return getGCD(a - b, b);
        else return getGCD( a, b - a);
    }
}
