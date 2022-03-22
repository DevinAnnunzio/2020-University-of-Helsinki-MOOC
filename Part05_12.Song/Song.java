
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object compared) {
        //if values are located in same memory
        if (this.artist == compared) {
            return true;
        }
        //if the compared object isn't same type song, return false
        if (!(compared instanceof Song)) {
            return false;
        }

        //convert obj into Song, to access variables
        Song comparedSong = (Song) compared;
        //compare the values
        if (artist == comparedSong.artist
                && name == comparedSong.name
                && durationInSeconds == comparedSong.durationInSeconds) {
            return true;
        }

        return false;

    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

}
