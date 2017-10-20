package kata3;

public class Kata3 {

    
    public static void main(String[] args) {
        Histogram histogram = new Histogram<>();
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.com");
        histogram.increment("gmail.com");
        histogram.increment("outlook.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ull.com");
        histogram.increment("gmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("gmail.com");
        
        new HistogramDisplay(histogram).execute();
    }
    
}
