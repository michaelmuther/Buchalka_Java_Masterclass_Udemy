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
        if (Album.albums == null) { // Album.albums will be null if it is the first creation.
            tempAlbum = Album.newAlbum(albumTitle); // new album created.
            System.out.println("new album created to initialize Album.albums from song: " + newSong.getSongTitle());
        } else if (albumExistsFromAlbumTitle(albumTitle)) {
            // if it does not exist, then create the album.  Adding album to the static list of albums should happen in the constructor.
            tempAlbum = Album.getAlbumFromAlbumTitle(albumTitle); // This is returning null
            System.out.println("Album already exists for song: " + newSong.getSongTitle()); // returns null
        } else {
            System.out.println("Album.albums initialized but album does not yet exist for song " + newSong.getSongTitle());
            tempAlbum = Album.newAlbum(albumTitle);
            System.out.println("New album created for song: " + newSong.getSongTitle()); // returns null
        }
        System.out.println("Song: " + newSong.getSongTitle() + " will be added to album " + tempAlbum.getAlbumTitle()); // null pointer for My Stony Baby.
        tempAlbum.getAlbumTrackList().add(newSong);
        // add thisSong to the static arrayList of all songs
        songs.add(newSong);
    }

    public String getSongTitle() {
        return songTitle;
    }

    public int getSongDurationInSeconds() {
        return songDurationInSeconds;
    }

    public String getAlbumTitleFromSong() {
        return getAlbumDotAlbumFromSongTitle(songTitle).getAlbumTitle();
    }

    public static Album getAlbumDotAlbumFromSongTitle(String songTitle) {
        return Album.getAlbumFromSongTitle(songTitle);
    }

    private static boolean albumExistsFromAlbumTitle(String albumTitle) {
        if(Album.albums == null) { // albums is null before any albums are added;
            return false;
        } else {
            for (Album album : Album.albums) {
                for (Song song : album.getAlbumTrackList()) {
                    if (albumTitle.equals(song.getAlbumTitleFromSong())) {
                        return true;
                    }
                }
            }
        }
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
