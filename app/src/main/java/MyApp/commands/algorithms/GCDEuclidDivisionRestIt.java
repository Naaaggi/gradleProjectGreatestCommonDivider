package MyApp.commands.algorithms;

public class GCDEuclidDivisionRestIt {
    static public int getGCD(int a, int b){
        while (b != 0){
            int h = a % b;
            a = b;
            b = h;
        }
        return a;
    }
}