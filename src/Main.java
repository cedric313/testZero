import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {

        double[] listTocheck = {30.0,40.2,30.5,1,-30.3,30.3,-1.03, 0.8};
        double value = closestToZero(listTocheck);
        System.out.println(value);
        boolean ok = true;


    }

    static double closestToZero(double[] ts) {
        ArrayList<Double> positivTemp = new ArrayList<>();
        ArrayList<Double> negativTemp = new ArrayList<>();

        return addToList(ts, positivTemp, negativTemp);
    }

    public static double addToList(double[] ts, ArrayList<Double> positivTemp, ArrayList<Double> negativTemp) {

        for(int i = 0; i < ts.length ; i++) {
            if(ts[i] < 0){
                negativTemp.add(ts[i]);
            } else {
                positivTemp.add(ts[i]);
            }
        }
        Collections.sort(positivTemp);
        double posPetite = positivTemp.get(0);

        Collections.sort(negativTemp);
        int lastIndice = negativTemp.size() -1;
        double negPetite = negativTemp.get(lastIndice);

        if(Math.abs(negPetite) < posPetite) {
            return Math.abs(negPetite);
        } return posPetite;
    }

}
