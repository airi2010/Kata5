
package ggaaa;
import ggaaa.view.PeopleLoader;
import ggaaa.view.HistogramDisplay;
import ggaaa.persistence.SqlitePeopleLoader;
import ggaaa.Model.Histogram;
import ggaaa.Model.Person;
import ggaaa.view.SwingHistogramDisplay;
import java.sql.*;
import java.util.List;
public class Ggaaa {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        List<Person> personlist=SqlitePeopleLoader.load();
        Histogram<String> peoplehistogram=  PeopleLoader.build(personlist);
        SwingHistogramDisplay.execute(peoplehistogram);
    }
    
}
