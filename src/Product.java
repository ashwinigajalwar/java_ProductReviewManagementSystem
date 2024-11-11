import java.util.ArrayList;
import java.util.List;

public class Product {
    private int id;
    private String title;
    private double price;
    private double discount;
    private List<Review>reviews;
    private static final int MAX_REVIEWS= 10;

    public Product(int id, String title, double price, double discount) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.discount = discount;
        this.reviews = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", reviews=" + reviews +
                '}';
    }

    public class Review{

        private float rating;
        private String body;
        private String title;

        public Review(float rating, String body, String title) {
            this.rating = rating;
            this.body = body;
            this.title = title;
        }

        @Override
        public String toString() {
            return "Review{" +
                    "rating=" + rating +
                    ", body='" + body + '\'' +
                    ", title='" + title + '\'' +
                    '}';
        }
    }

    public void addReview(float rating,String body, String title) {
        if (reviews.size() < MAX_REVIEWS) {
            Review newReview = new Review(rating, body, title);
            reviews.add(newReview);
            System.out.println("Review added Successfully");
        } else {
            System.out.println("Cannot add review as we have already reached the max. size of reviews");
        }
    }

    public void removeReview(int index){
        if (index>=0 && index< reviews.size()){
            reviews.remove(index);
            System.out.println("Review removed successfully");
        }else {
            System.out.println("Invalid index.Review not found");
        }
    }

    public void printReviews(){

        if (reviews.isEmpty()){
            System.out.println("No reviews available.");
        }else {
            for (Review review:reviews){
                System.out.println(review);
                System.out.println("--------------");
            }
        }
    }


}
