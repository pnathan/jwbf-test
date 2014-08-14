package opw.jwbf.app;

import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import net.sourceforge.jwbf.core.contentRep.Article;

public class JavaBot {

/** 
 * Sample bot that retrieves and edits an article. 
 * Sample code from the JWBF README. 
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
