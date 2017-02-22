package demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.batch.api.BatchProperty;
import javax.batch.api.chunk.AbstractItemWriter;
import javax.inject.Inject;

public class DemoWriter extends AbstractItemWriter {
    @Inject @BatchProperty String outputFile;
    
    public void writeItems(List<java.lang.Object> items) {
        try {
        	PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(outputFile, true)));
        	for (Object item:items)
        		pw.println(item);
        	pw.flush();
        	pw.close();
        } catch (IOException e) {
        	e.printStackTrace();
        }
    }

}
