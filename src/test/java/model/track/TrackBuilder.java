package model.track;

import model.Artist;
import model.Title;

/**
 * Builds a track
 */
public class TrackBuilder {

    public Track buildTrackWith(Artist artist, Title title) {
        return Track.Builder.track()
                .withArtist(artist)
                .withTitle(title)
                .build();
    }
}
