package opw.jwbf.app;

/**
 * Hello world!
 *
 */
//public class App 
//{
//    public static void main( String[] args )
//    {
//        System.out.println( "Hello World!" );
//    }
//}
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import net.sourceforge.jwbf.core.contentRep.Article;

public class JavaBot {

/** 
 * Sample bot that retrieves and edits an article
 */
  public static void main(String[] args) {
    System.out.println("Hello JWBF!");
    MediaWikiBot wikiBot = new MediaWikiBot("https://en.wikipedia.org/w/");
    Article article = wikiBot.getArticle("42");
    System.out.println(article.getText().substring(5, 42));
    // HITCHHIKER'S GUIDE TO THE GALAXY FANS
//    applyChangesTo(article);
//    wikiBot.login("user", "***");
//    article.save();
  }

//  static void applyChangesTo(Article article) {
    // edits the article...


}
