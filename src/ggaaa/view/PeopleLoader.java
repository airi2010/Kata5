/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ggaaa.view;

import ggaaa.Model.Histogram;
import ggaaa.Model.Person;
import java.util.List;

/**
 *
 * @author Airam
 */
public class PeopleLoader {
     public static Histogram<String> build(List<Person> peoplelist) {
        Histogram<String> histogram = new Histogram();
        for (Person  person: peoplelist ){
            histogram.increment(person.getDomain());
        }
        
        return histogram;
    }
    
    
}
