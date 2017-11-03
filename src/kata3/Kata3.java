package kata3;

public class Kata3 {

    
    public static void main(String[] args) {
        Histogram histogram = new Histogram<>();
        histogram.increment(3,8);        
        histogram.increment(2,1);
        histogram.increment(2,2);
        histogram.increment(3,4);
        histogram.increment(1,2);
        histogram.increment("ull.com",4);
        histogram.increment("gmail.com",5);
        histogram.increment("hotmail.com",2);
        histogram.increment("hotmail.com",1);
        histogram.increment("gmail.com",6);
        
        new HistogramDisplay(histogram).execute();
    }
    
}
