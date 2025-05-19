package module_3.practice3_1;

public class MusicPlayer {
  public void playPlaylist(Playlist playlist) {
    playlist.getTracks().forEach(m ->
        System.out.printf(
            "Сейчас играет трек с названием [%s] исполнитель [%s] жанр [%s] длительность [%d]%n",
            m.getTitle(), m.getArtist(), m.getGenre(), m.getDuration()
        )
    );
  }
}
