package linked.list.challenge.tim;

import java.util.ArrayList;
import java.util.LinkedList;

public class AlbumTim {
    private String name;
    private String artist;
    private ArrayList<SongTim> songs;

    public AlbumTim(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<SongTim>();
    }

    public boolean addSong(String title, double duration) {
        if(findSong(title) == null) {
            this.songs.add(new SongTim(title, duration));
            return true;
        }
        return false;
    }

    private SongTim findSong(String title) {
        for(SongTim checkedSong : this.songs) {
            if(checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<SongTim> playList) {
        int index = trackNumber - 1;
        if((index > 0) && (index <= this.songs.size())) {
            playList.add(this.songs.get(index));
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<SongTim> playList) {
            SongTim checkedSong = findSong(title);
            if(checkedSong != null) {
                playList.add(checkedSong);
                return true;
            }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

}
