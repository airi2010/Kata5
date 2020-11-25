/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ggaaa.view;

import ggaaa.Model.Histogram;
import java.awt.Container;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author Airam
 */
public class HistogramDisplay extends ApplicationFrame {
   private final Histogram<String> histogram;
   private final int mode;
   private final String title,X,Y;
    public HistogramDisplay(String title,Histogram <String> histogram,int mode,String X,String Y) {
        super(title);
        this.title=title;
        this.X=X;
        this.Y=Y;
        this.histogram=histogram;
        this.mode=mode;
        this.setContentPane(createPanel());
        this.pack();
    }

    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        return chartPanel;
    }
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart=null;
        if(mode==0){
            chart = ChartFactory.createBarChart(title, X, Y, dataSet, PlotOrientation.VERTICAL,false,false, rootPaneCheckingEnabled); 
        }else{
           chart = ChartFactory.createBarChart(title, X, Y, dataSet, PlotOrientation.HORIZONTAL,false,false, rootPaneCheckingEnabled);
        }
        
        return chart;
    }
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (String key : histogram.keySet()){
             dataset.addValue(histogram.get(key), "", key);
        }
        return dataset;
    }
    public void execute(){
        this.setVisible(true);
    }     
}
