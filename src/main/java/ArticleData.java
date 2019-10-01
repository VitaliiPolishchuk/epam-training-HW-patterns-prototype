public class ArticleData implements Cloneable{
    String data;

    public ArticleData(String data) {
        this.data = data;
    }

    @Override
    protected Object clone(){
        return new ArticleData(data);
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data;
    }
}
