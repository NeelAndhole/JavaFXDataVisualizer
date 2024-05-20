import java.util.List;

/**
 * this class represents an individual review
 */
public class Review {
  protected String posterURL;
  protected String title;
  protected int year;
  protected String certificate;
  protected int duration;
  protected List<String> genres;
  protected float rating;
  protected int metascore;
  protected String director;
  protected List<String> cast;
  protected int votes;
  protected String description;
  protected int reviewCount;
  protected String reviewTitle;
  protected String reviewText;

  public Review(String posterURL, String title, int year, String certificate, int duration,
      List<String> genres, float rating, int metascore, String director, List<String> cast,
      int votes, String description, int reviewCount, String reviewTitle, String reviewText) {
    this.posterURL = posterURL;
    this.title = title;
    this.year = year;
    this.certificate = certificate;
    this.duration = duration;
    this.genres = genres;
    this.rating = rating;
    this.metascore = metascore;
    this.director = director;
    this.cast = cast;
    this.votes = votes;
    this.description = description;
    this.reviewCount = reviewCount;
    this.reviewTitle = reviewTitle;
    this.reviewText = reviewText;
  }

}
