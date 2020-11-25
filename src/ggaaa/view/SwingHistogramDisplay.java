/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ggaaa.view;

import ggaaa.Model.Histogram;

public interface SwingHistogramDisplay {

    public static void execute(Histogram<String> peoplehistogram){
        HistogramDisplay histogramdis = new HistogramDisplay("Histogram",peoplehistogram,0,"email","nº emails");
        histogramdis.execute();
    }
    
}
