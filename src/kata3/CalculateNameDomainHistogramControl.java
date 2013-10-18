package kata3;

public class CalculateNameDomainHistogramControl {
    
    private String filename;
    
    public CalculateNameDomainHistogramControl(String filename) {
        this.filename = filename;
    }

    public void execute(){
        HistogramBuilder<String> builder = new HistogramBuilder<>();
        builder.calculate(MailReader.readDomains(filename));
        HistogramViewer<String> viewer = new HistogramViewer<>(builder.getHistogram());
        viewer.show(20);
    }
}
