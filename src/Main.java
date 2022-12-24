import java.util.ArrayList;

public class Main {
    public static int GetPessenger(ArrayList<int[]> Biskota){
        int totalPessenger = 0;
        for (int[] stop : Biskota){
            totalPessenger += stop[0] - stop[1];
        }return totalPessenger;
    }
    public static void main(String[] args) {
        ArrayList<int[]> stopGo = new ArrayList<int[]>();
            stopGo.add (new int[]{10,0});
            stopGo.add (new int[]{3,5});
            stopGo.add (new int[]{2,5});
        System.out.println(GetPessenger(stopGo));
    }
}