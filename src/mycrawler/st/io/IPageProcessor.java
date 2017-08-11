package mycrawler.st.io;

import org.jsoup.nodes.Document;

/**
 * @author Wenbo Liu
 */
public interface IPageProcessor {
    public void process(String url, Document doc);
}
