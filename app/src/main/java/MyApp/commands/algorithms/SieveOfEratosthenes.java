package MyApp.commands.algorithms;

public class SieveOfEratosthenes{

    public static int[] getPrime(int number){
        int[] list = new int[number-1];
        int zeroCounter = 0;
        for(int i=0; i<number-1; i++){
            list[i] = i+2;
        }
        for(int i=0; i<list.length; i++){
            for(int n=0; n<list.length; n++){
                if((list[i]==0) || (list[n]==0))
                    continue;
                if((list[n]%list[i]==0) && (list[n]!=list[i])){
                    list[n]=0;
                    zeroCounter++;
                }
            }
        }
        return removeZeros(list, list.length-zeroCounter);
    }

    private static int[] removeZeros(int[] list, int size) {
        int[] resultList = new int[size];
        int counter = 0;
        for (int i : list) {
            if (i != 0) {
                resultList[counter] = i;
                counter++;
            }
        }
        return resultList;
    }
}
