package mycrawler.st.io;

import mycrawler.util.SameWebsiteOnlyFilter;

/**
 * @author Wenbo Liu
 */
/**
 * This class is an example of how to use the Crawler class. You should
 * not expect to use this class as it is. Use the Crawler class directly
 * from your own code.
 */
public class CrawlerMain {

    public static void main(String[] args) {

        /*if(args.length < 1) {
            System.err.println("Provide a URL as argument to the CrawlerMain class.");
            return;
        }*/

        //String url = args[0];
        //String url ="http://tutorials.jenkov.com";
        //String url ="http://martinfowler.com";
        String url ="http://www.vogella.com";

        Crawler crawler  = new Crawler();
        crawler.setUrlFilter(new SameWebsiteOnlyFilter(url));
        crawler.setPageProcessor(null); // set an IPageProcessor instance here.
        crawler.addUrl(url);

        crawler.crawl();
    }
}
