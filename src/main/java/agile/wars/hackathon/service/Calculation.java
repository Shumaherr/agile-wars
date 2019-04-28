package agile.wars.hackathon.service;

public class Calculation {
    public static double calcFunc(double x, double y, double b)
    {
        if(x>=0 && x <= y )
        {
            return -(x*b)/y + 1 + b;
        }
        else
        {
            return 1/(x-y+1);
        }
    }

    public static double[] calcForAnal(double bonus, double qAmount, double qAverage, double begin, double end, double deadLine)
    {
        begin = 0;
        end = 15;
        deadLine = 16;
        bonus = 0.5;

        qAmount = 3;
        qAverage = 5;


        double a = 1;
        double q = calcFunc(qAmount,qAverage,bonus);
        double v = calcFunc(end,deadLine,bonus);

        double output[] = {a,q,v};
        return output;
    }

    
}
