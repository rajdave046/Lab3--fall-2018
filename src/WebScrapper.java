import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class WebScrapper {
    public static void main(String[] unsused) {
        System.out.println("Ran");
        urlToString file = new urlToString(("http://erdani.com/tdpl/hamlet.txt");
        urlToStringInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);

        String line;
        int wordCount = 0;
    }
/**
 * Retrieve contents from a URL and return them as a string.
 *
 * @param url url to retrieve contents from
 * @return the contents from the url as a string, or an empty string on error
 */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }
}
