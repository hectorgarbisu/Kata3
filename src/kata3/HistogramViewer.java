package kata3;


public class HistogramViewer<T> {
    private Histogram<T> histogram;

    public HistogramViewer(Histogram<T> histogram) {
        this.histogram = histogram;
    }
    
    public void show(){
        for (T key : histogram.keySet()) {
            System.out.println(key + ": " + histogram.get(key));
        }
    }
    
    public void show(int max){
        for (int i = max; i >= 0; i--) {
            for (T key : histogram.keySet()) {
                if(histogram.get(key)>=i) System.out.print("#");
                else System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println("\n");
        }
        String espacio = " ";
        for (T key : histogram.keySet()) {
            System.out.println(espacio + key);
            espacio += "  ";
        }
    }
}
