package edu.parinya.softarchdesign.behavioral;


public class NewsReader implements NewsSubscriber {
    private String readerName;

    public NewsReader(String name) {
        readerName = name;
    }

    @Override
    public void update(String detail) {
        System.out.println(readerName+" : "+detail);
    }

    public String getName() {
        return readerName;
    }

}