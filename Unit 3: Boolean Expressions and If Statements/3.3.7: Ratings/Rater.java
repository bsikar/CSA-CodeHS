public class Rater {
    private String name;
    private double rating;
    private String review;

    public Rater(String company, double initialRating) {
        name = company;
        rating = initialRating;
        review = "";
    }

    public void setRating(double newRating) {
        if (newRating <= 5) {
            rating = newRating;
        }
    }

    public void updateReview() {
        if (rating >= 3) {
            review = "Proudly Recommended";
        } else {
            review = "Needs more ratings";
        }
    }

    public double getRating() {
        return rating;
    }

    public String toString() {
        return name + " : " + review;
    }
}
