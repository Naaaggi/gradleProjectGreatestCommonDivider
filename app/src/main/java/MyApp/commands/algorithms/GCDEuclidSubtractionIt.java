package MyApp.commands.algorithms;

public class GCDEuclidSubtractionIt {

    static public int getGCD(int a, int b){
        if(a == 0){
            return b;
        }
        else{
            while (b != 0){
                if (a>b)
                    a=a-b;
                else
                    b=b-a;

            }
        }
        return a;
    }
}
