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
    
    public HistogramDisplay() {
        super("Histogram");
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
        dataSet.addValue(5, "", "gmail.com");
        dataSet.addValue(10, "", "ulpgc.com");
        dataSet.addValue(7, "", "ull.com");
        dataSet.addValue(2, "", "hotmail.com");
        return dataSet;
    }
    
    public void execute(){
        setVisible(true);
    }
}
