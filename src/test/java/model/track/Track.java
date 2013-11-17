package model.track;

import model.Artist;
import model.Title;

public class Track {

    private final Artist artist;
    private final Title title;

    public Track(Builder builder) {
        artist = builder.artist;
        title = builder.title;
    }

    public static class Builder {
        private Artist artist;
        private Title title;

        public static Builder track() {
            return new Builder();
        }

        public Builder withArtist(Artist artist) {
            this.artist = artist;
            return this;
        }

        public Builder withTitle(Title title) {
            this.title = title;
            return this;
        }

        public Track build() {
            return new Track(this);
        }
    }
}
