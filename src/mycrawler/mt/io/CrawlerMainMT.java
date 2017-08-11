package mycrawler.mt.io;

import mycrawler.util.SameWebsiteOnlyFilter;

/**
 * @author Wenbo Liu
 */
public class CrawlerMainMT {

    public static void main(String[] args) {

        /*if(args.length < 1) {
            System.err.println("Provide a URL as argument to the CrawlerMainMT class.");
            return;
        }*/

        //String url = args[0];
        String url = "https://stackoverflow.com";
        CrawlerMT crawler  = new CrawlerMT(new SameWebsiteOnlyFilter(url));
        crawler.addUrl(url);
        crawler.crawl();
    }
}
