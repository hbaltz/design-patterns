package proxy.youtube_media_library;

import proxy.youtube_media_library.video.Video;

import java.util.HashMap;

/**
 * Used to modeled a third party youtube library
 */
public interface IThirdPartyYoutubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
