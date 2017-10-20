package kata3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;


class HistogramDisplay extends ApplicationFrame{
    private final Histogram <String> histogram;
    
    public HistogramDisplay(Histogram<String> histogram) {
        super("HISTOGRAM");
        this.histogram = histogram;
        
        setContentPane(createPanel());
        pack();
    }

    private JPanel createPanel(){
        ChartPanel panel = new ChartPanel( createChart(createDataSet()));
        panel.setPreferredSize(new Dimension(500, 400));
        return panel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart3D("JFreeChart Histogram", 
                                                         "Dominios email", 
                                                         "Número de emails",
                                                         dataSet,
                                                         PlotOrientation.VERTICAL, 
                                                         false, 
                                                         rootPaneCheckingEnabled, 
                                                         rootPaneCheckingEnabled
        );
        return chart;
    }
    
    private DefaultCategoryDataset createDataSet(){
        DefaultCategoryDataset dataSet=new DefaultCategoryDataset();
        
        for (String key : histogram.keySet()) {
            dataSet.addValue(histogram.get(key),"",key);
        }
        
        return dataSet;
    }
    
    public void execute(){
        setVisible(true);
    }
}
