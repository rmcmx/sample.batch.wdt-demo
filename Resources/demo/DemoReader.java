package demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;

import javax.batch.api.BatchProperty;
import javax.batch.api.chunk.AbstractItemReader;
import javax.inject.Inject;

public class DemoReader extends AbstractItemReader {
	@Inject @BatchProperty String inputFile;
	BufferedReader bf;
	
    @Override
	public void open(Serializable checkpoint) throws Exception {
		super.open(checkpoint);
		bf = new BufferedReader(new FileReader(inputFile));
	}

    public Object readItem() throws IOException {
		if (bf != null && bf.ready()) {
			String line = bf.readLine();
			if (line == null) {
				bf.close();
				bf = null;
			}
			return line;
		}
		return null;
    }

}
