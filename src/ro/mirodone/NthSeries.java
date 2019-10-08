package ro.mirodone;



public class NthSeries {


    public String seriesSum(int n) {

        String result ;
        double num = 0.0;
        double rrr = 1.0;


        if (n == 0) {
            return  "0.00";
        }

        for (int i = 0; i < n; i++) {


            num = num + 1 / rrr;
            rrr = rrr + 3;
        }


        result = String.format("%.2f", num);

        return result;

    }


}
