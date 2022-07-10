package linked.list.challenge;

/*
The Ipod class has a playlist.
The Playlist has songs.
Albums have songs.
Each song is included on an album.
The Ipod can show a list of all songs and albums
The Ipod has a menu to quit, skip forward to next song, skip backwards to a previous song,
replay the current song.  List the songs in the playlist
remove a song from the playlist.
 */

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Ipod {

    private static LinkedList<Song> playlist = new LinkedList<>();

    public static void main(String[] args) {
        // Create song, constructor has song and album.
        // Create album if album is not already created.
        // print all songs available
        // print all songs in playlist
        // print all songs by album
        // print all albums

        Ipod test = new Ipod();
        test.doWork();
    }

    private void doWork() {
        Song.newSong("8:16 AM", "Grassroots", 186);
        Song.newSong("Do You Right", "Music", 195);
        Song.newSong("My Stony Baby", "Grassroots", 203);
        playlist.add(Song.getSong("8:16 AM"));
        playlist.add(Song.getSong("Do You Right"));
        playlist.add(Song.getSong("My Stony Baby"));
//        System.out.println(Album.getAlbum("Do You Right").getAlbumTitle()); // Works
//        Album.printAll();
//        Song.printAll();
        System.out.println("Welcome to Ipod 3000!");
        ipodMenu();
    }

    public static void ipodMenu() {
        Scanner scanner = new Scanner(System.in);
        ListIterator<Song> i = playlist.listIterator();
        Song currentSong = null;
        boolean playingForward = true;
        boolean quit = false;
        while (!quit) {
            System.out.println("1 - Quit");
            System.out.println("2 - Play next song");
            System.out.println("3 - Play previous song");
            System.out.println("4 - Replay song");
            System.out.println("5 - Add song to playlist");
            System.out.println("6 - Remove song from the playlist");
            System.out.println("7 - List all songs in the playlist");
            System.out.println("8 - List all songs in all albums");
            System.out.println("Please enter your selection: ");
            int input = scanner.nextInt();

            switch (input) {
                case 1: {
                    System.out.println("Goodbye!");
                    quit = true;
                    break;
                }
                case 2: {
                    if(playlist.isEmpty()) {
                        System.out.println("No songs in playlist!");
                    } else if (!i.hasNext()) {
                        currentSong = playlist.getLast();
                    } else {
                        if(!playingForward) {
                            i.next();
                        }
                        currentSong = i.next();
                    }
                    String song = currentSong.getSongTitle();
                    String album = currentSong.getAlbumTitleFromSong();
                    System.out.println("Playing song \"" + song + "\" from the album \"" + album + "\".\n");
                    playingForward = true;
                    break;
                }
                case 3:{
                    if(playlist.isEmpty()) {
                        System.out.println("No songs in playlist!");
                    } else if (!i.hasPrevious()) {
                        currentSong = playlist.getFirst();
                    } else {
                        if(playingForward) {
                            i.previous();
                        }
                        if (i.hasPrevious()) {
                            currentSong = i.previous();
                        }
                    }
                    String song = currentSong.getSongTitle();
                    String album = currentSong.getAlbumTitleFromSong();
                    System.out.println("Playing song \"" + song + "\" from the album \"" + album + "\".\n");
                    playingForward = false;
                    break;
                }
                case 4:{
                    if(playlist.isEmpty()) {
                        System.out.println("No songs in playlist!");
                    } else {
                        if (currentSong == null) {
                            currentSong = i.next();
                        }
                        String song = currentSong.getSongTitle();
                        String album = currentSong.getAlbumTitleFromSong();
                        System.out.println("Playing song \"" + song + "\" from the album \"" + album + "\".\n");
                    }
                    break;
                }
                case 5:{
                    addSongToPlaylist();
                    break;
                }
                case 6:{
                    if(playlist.isEmpty()) {
                        System.out.println("No songs in playlist!");
                    } else {
                        removeSongFromPlaylist();
                    }
                    break;
                }
                case 7:{
                    if(playlist.isEmpty()) {
                        System.out.println("No songs in playlist!");
                    } else {
                        int index = 1;
                        for(Song songInPlaylist : playlist) {
                            System.out.println(index + ". " + songInPlaylist.getSongTitle());
                            index++;
                        }
                        System.out.println();
                    }
                    break;
                }
                case 8:{
                    for(Album album : Album.albums) {
                        for(Song song : album.getAlbumTrackList()) {
                            System.out.println("Album: " + album.getAlbumTitle() + " Song: " + song.getSongTitle());
                        }
                    }
                    break;
                }
                default: {
                    System.out.println("Please make a valid entry!");
                }
            }
        }
    }

    private static void addSongToPlaylist() {
        System.out.println("Here are the available songs to add to the playlist: ");
        Song.printAll();
        System.out.println("Enter the song you want to add: ");
        String input = new Scanner(System.in).nextLine();
        Song tempSong = Song.getSong(input);
        playlist.add(tempSong);
        System.out.println("Added " + tempSong.getSongTitle() + " to playlist!");
    }

    private static void removeSongFromPlaylist() {
        System.out.println("Here are the current songs in the playlist: ");
        int index = 1;
        for (Song song : playlist) {
            System.out.println(index + ". " + song.getSongTitle());
            index++;
        }
        System.out.println("Choose a song to remove: ");
        String input = new Scanner(System.in).nextLine();
        Song tempSong = Song.getSong(input);
        playlist.remove(tempSong);
        System.out.println("Removed " + tempSong.getSongTitle() + " from playlist!");
    }
}
