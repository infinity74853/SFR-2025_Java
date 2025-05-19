package module_3.practice3_1;

public class Music {
  private String title;
  private String artist;
  private int rating;
  private int duration;
  private String genre;

  public Music(String title, String artist, int duration, String genre) {
    this.title = title;
    this.artist = artist;
    this.rating = 1;
    this.duration = duration;
    this.genre = genre;
  }

  // Getters
  public String getTitle() {
    return title;
  }

  public String getArtist() {
    return artist;
  }

  public int getRating() {
    return rating;
  }

  public int getDuration() {
    return duration;
  }

  public String getGenre() {
    return genre;
  }

  @Override
  public String toString() {
    return title + " - " + artist + " [" + genre + "] " + duration + "s (★" + rating + ")";
  }
}
