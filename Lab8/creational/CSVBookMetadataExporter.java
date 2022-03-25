package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class CSVBookMetadataExporter extends BookMetadataExporter{
    @Override
    public BookMetadataFormatter createBookFormatter() throws IOException, ParserConfigurationException {
        return new CSVBookMetadataFormatter();
    }
}
