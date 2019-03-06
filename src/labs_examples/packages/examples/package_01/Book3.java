package labs_examples.packages.examples.package_01;

/**
 * Created by ryandesmond on 3/27/17.
 */
public class Book3 {
    // these are now protected
    protected String title;
    protected String author;
    protected int pubDate;

    public Book3(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }

    public void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}