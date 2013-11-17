package track;


import model.Artist;
import model.Title;
import model.track.Track;
import model.track.TrackBuilder;
import org.junit.Test;

import static com.shazam.shazamcrest.matcher.Matchers.sameBeanAs;
import static model.Artist.artist;
import static model.Title.title;
import static model.track.Track.Builder.track;
import static org.junit.Assert.assertThat;

public class TrackBuilderTest {

    public static final Artist ARTIST = artist("artist");
    public static final Title TITLE = title("title");

    @Test
    public void test() {
        TrackBuilder trackBuilder = new TrackBuilder();
        Track track = trackBuilder.buildTrackWith(artist("artist"), title("title"));
        assertThat(track, sameBeanAs(track()
                                        .withArtist(ARTIST)
                                        .withTitle(TITLE)
                                        .build()));


    }
}
