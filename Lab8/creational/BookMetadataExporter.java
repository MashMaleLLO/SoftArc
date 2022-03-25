package creational;

import java.io.PrintStream;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;

public abstract class BookMetadataExporter extends BookCollection {

    public void export(PrintStream stream) throws IOException, ParserConfigurationException {

        // Please implement this method. You may create additional methods as you see fit.
        BookMetadataFormatter formatter = createBookFormatter();

        for(Book book : books){
            formatter.append(book);
        }

        stream.println(formatter.getMetadataString());
    }
    public abstract BookMetadataFormatter createBookFormatter() throws IOException, ParserConfigurationException;
}
