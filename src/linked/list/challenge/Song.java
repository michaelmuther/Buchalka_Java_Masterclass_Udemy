package linked.list.challenge;

import java.util.ArrayList;

public class Song {

    private final String songTitle;
    private final int songDurationInSeconds;
    public static ArrayList<Song> songs; // how to add this Song instance to a static ArrayList of the class within the constructor?

    public Song (String songTitle, int songDurationInSeconds) {
        this.songTitle = songTitle;
        this.songDurationInSeconds = songDurationInSeconds;
    }

    public static void newSong(String songTitle, String albumTitle, int songDurationInSeconds) {
        // create new Song object:
        Song newSong = new Song(songTitle, songDurationInSeconds);
        // check if songs is already initialized
        if (songs == null) {
            songs = new ArrayList<>();
        }

        // if the album exists already, just add this song to the album's tracklist
        Album tempAlbum;// add this new song to the new album's list of songs
        if (albumExists(albumTitle)) {
            tempAlbum = getAlbum(albumTitle);
            // if it does not exist, then create the album.  Adding album to the static list of albums should happen in the constructor.
        } else {
            tempAlbum = Album.newAlbum(albumTitle);
        }
        tempAlbum.addSong(newSong); // add this new song to the album's list of songs

        // add thisSong to the static arrayList of all songs
        songs.add(newSong);
    }

    public String getSongTitle() {
        return songTitle;
    }

    public int getSongDurationInSeconds() {
        return songDurationInSeconds;
    }

    public String getAlbumTitle() {
        return getAlbum(songTitle).getAlbumTitle();
    }

    public static Album getAlbum(String songTitle) {
        return Album.getAlbum(songTitle);
    }

    private static boolean albumExists(String albumTitle) {

        return false;
    }

    public static void printAll() {
        for (Song song : songs) {
            System.out.println(song.getSongTitle());
        }
    }

    public static Song getSong(String songTitleInput) {
        for (Song song : songs) {
            if (song.getSongTitle().equals(songTitleInput)) {
                return song;
            }
        }
        return null;
    }
}
