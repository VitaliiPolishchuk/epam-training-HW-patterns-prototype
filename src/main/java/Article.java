public class Article implements Cloneable{
    ArticleData articleData;

    public Article(String name) {
        this.articleData = new ArticleData("Article data" + name);
    }

    public Article(Article article) {
        this.articleData = (ArticleData) article.articleData.clone();
    }

    @Override
    protected Object clone(){
        return new Article(this);
    }

    @Override
    public String toString() {
        return articleData.toString();
    }
}
