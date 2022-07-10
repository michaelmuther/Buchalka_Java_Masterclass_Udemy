package linked.list.challenge;

import java.util.ArrayList;

public class Album {

    public static ArrayList<Album> albums; // how to add this Album instance to a static ArrayList of the class within the constructor?
    private final ArrayList<Song> albumTrackList;
    private final String albumTitle;

    public Album(String albumTitle) {
        this.albumTitle = albumTitle;
        this.albumTrackList = new ArrayList<>();
    }

    public static Album newAlbum (String albumTitle) {
        Album newAlbum = new Album(albumTitle);
        if (albums == null) {
            albums = new ArrayList<>();
        }
        albums.add(newAlbum);
        return newAlbum;
    }

    public ArrayList<Song> getAlbumTrackList() {
        return albumTrackList;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void addSong(Song song) {
        albumTrackList.add(song);
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
    public static Album getAlbumFromSongTitle(String songTitle) { // TESTED, this works
        for (Album album : albums) {
            for (Song song : album.getAlbumTrackList()) { // tracklist is a linked list
                if (songTitle.equals(song.getSongTitle())) {
                    return album;
                }
            }
        }
        return null;
    }

    public static Album getAlbumFromAlbumTitle(String albumTitle) {
        for (Album album : albums) {
            if (albumTitle.equals(album.getAlbumTitle())) {
                return album;
            }
        }
        return null;
    }
}
