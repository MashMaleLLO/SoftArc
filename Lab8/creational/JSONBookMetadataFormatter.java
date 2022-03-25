package creational;

import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private JSONObject jsBook;
    private JSONArray listBook;

    public JSONBookMetadataFormatter() throws IOException {
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        jsBook = new JSONObject();
        listBook = new JSONArray();
        jsBook.put(Book.class.getSimpleName() + "s", listBook);
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        String[] authors = b.getAuthors();
        try {
            JSONObject jbook = new JSONObject();
            JSONArray authorsLs = new JSONArray();
            for(int i=0; i<authors.length; i++)
            {
                authorsLs.add(authors[i]);
            }
            jbook.put(Book.Metadata.ISBN.value, b.getISBN());
            jbook.put(Book.Metadata.AUTHORS.value, authorsLs);
            jbook.put(Book.Metadata.TITLE.value, b.getTitle());
            jbook.put(Book.Metadata.PUBLISHER.value, b.getPublisher());

            listBook.add(jbook);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public String getMetadataString() {
        return jsBook.toJSONString();
    }
}
