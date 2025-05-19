package module_3.practice3_1;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
  private List<Music> tracks = new ArrayList<>();

  public void addMusic(Music music) {
    tracks.add(music);
  }

  public void removeMusicByTitle(String title) {
    tracks.removeIf(m -> m.getTitle().equals(title));
  }

  public int getTrackCount() {
    return tracks.size();
  }

  public void printTracksByGenre(String genre) {
    tracks.stream()
        .filter(m -> m.getGenre().equalsIgnoreCase(genre))
        .forEach(System.out::println);
  }

  public List<Music> getTracks() {
    return tracks;
  }
}
