package edu.parinya.softarchdesign.behavioral;

import java.util.ArrayList;

public class NewsPublisher {

    private String pubName;
    private News mainNews;
    private ArrayList<NewsSubscriber> subs = new ArrayList<NewsSubscriber>();

    public NewsPublisher(){
    }


    public void subscribe(NewsSubscriber sub) {
        subs.add(sub);
    }

    public void unsubscribe(NewsSubscriber sub) {
        subs.remove(sub);
    }

    public void notifySubs(String content) {
        System.out.println("Published "+mainNews.getTopic()+" news to subscribers");
        for (NewsSubscriber s : subs) {
            s.update(content);
        }
    }

    public void publish(News newState){
        mainNews = newState;
        notifySubs(mainNews.getContent());
    }

    public void setName(String name) {
        this.pubName = name;
    }

    public String getName() {
        return pubName;
    }
}