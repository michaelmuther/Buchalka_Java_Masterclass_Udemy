package linked.list.challenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    public static ArrayList<Album> albums; // how to add this Album instance to a static ArrayList of the class within the constructor?
    private final LinkedList<Song> albumTrackList;
    private final String albumTitle;

    public Album(String albumTitle) {
        this.albumTitle = albumTitle;
        this.albumTrackList = new LinkedList<>();
    }

    public static Album newAlbum (String albumTitle) {
        Album newAlbum = new Album(albumTitle);
        if (albums == null) {
            albums = new ArrayList<>();
        }
        albums.add(newAlbum);
        return newAlbum;
    }

    public LinkedList<Song> getAlbumTrackList() {
        return albumTrackList;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public boolean addSong(Song song) {
        if (songInAlbum(song)) {
            return false;
        } else {
            albumTrackList.add(song);
        }
        return true;
    }

    private boolean songInAlbum(Song checkSong) {
        for (Song song : albumTrackList) {
            if (song.getSongTitle().equals(checkSong.getSongTitle()) ) {
                return true;
            }
        }
        return false;
    }

    public static void printAll() {
        for (Album album : albums) {
            System.out.println(album.getAlbumTitle());
        }
    }

    // iterate through static list of albums to find album by song title
    public static Album getAlbum(String title) {
        for (Album album : albums) {
            for (Song song : album.getAlbumTrackList()) {
                if (title.equals(song.getSongTitle())) {
                    return album;
                }
            }
        }
        return null;
    }
}
