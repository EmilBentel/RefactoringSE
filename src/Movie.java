public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private final String title;
    private int priceCode;
    public Movie(String newtitle, int newpriceCode) {
        title = newtitle;
        priceCode = newpriceCode;
    }
    public int getPriceCode() {
        return priceCode;
    }
// --Commented out by Inspection START (09.05.2017 11:42):
//    public void setPriceCode(int arg) {
//        priceCode = arg;
//    }
// --Commented out by Inspection STOP (09.05.2017 11:42)
    public String getTitle (){
        return title;
    }
}