package edu.parinya.softarchdesign.behavioral;

public class Main {
    public static void main(String[] args) {
        NewsPublisher blognone = new NewsPublisher();
        NewsPublisher brandInside = new NewsPublisher();
        NewsPublisher prachatai = new NewsPublisher();
        NewsPublisher maleNews = new NewsPublisher();
        maleNews.setName("MaleNews");

        NewsReader parinya = new NewsReader("Parinya");
        blognone.subscribe(parinya);
        prachatai.subscribe(parinya);
        NewsReader rome = new NewsReader("Rangsiman");
        prachatai.subscribe(rome);
        NewsReader mai = new NewsReader("Sirikanya");
        brandInside.subscribe(mai);
        NewsReader prawit = new NewsReader("Prawit");
        NewsReader Male = new NewsReader("Narawich");
        maleNews.subscribe(Male);

        News techNews = new TechnologyNews("A new security issue was found in Google Chrome.");
        News ecoNews = new EconomicNews("Fed raises interest rate by a half percentage.");
        News polNews = new PoliticalNews("Chatchart wins the election.");
        News testNew = new PoliticalNews("The New News Publisher "+maleNews.getName()+" was now published");

        blognone.publish(techNews);
        brandInside.publish(ecoNews);
        prachatai.publish(ecoNews);
        prachatai.publish(polNews);
        maleNews.publish(testNew);
    }
}