public class Main {
    public static void main(String[] args) {
        Article article = new Article("1");
        Article articleClone = (Article) article.clone();

        System.out.println("Article 1 is: " + article);
        System.out.println("Article clone is: " + articleClone);
        System.out.println("Article 1 == Article clone: " + (article == articleClone));
    }
}
