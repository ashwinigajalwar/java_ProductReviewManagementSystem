
public class Main {
    public static void main(String[] args) {

        Product product= new Product(1,"Smartphone",25000.00,0.5);
        for (int i = 0; i < 12 ; i++) {
            product.addReview(4.7f, " I'm really satisfied with the product", "Excellent Product");
        }

        System.out.println("All Reviews:");
        product.printReviews();

        product.removeReview(1);
        System.out.println("All Reviews after removing a review: ");
        product.printReviews();
    }
}