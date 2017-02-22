package demo;

import javax.batch.api.chunk.ItemProcessor;

public class DemoProcessor implements ItemProcessor {

    public Object processItem(Object item) {
        if (item != null) {
        	if (item instanceof String) {
        		String line = (String) item;
        		if (line.matches("^\\d*[02468].*"));
        			return "Item: " + item;
        	}
        }
        return null;
    }
}
