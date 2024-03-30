package proxy.youtube_media_library.cache_proxy;

import proxy.youtube_media_library.IThirdPartyYoutubeLib;
import proxy.youtube_media_library.third_party_library.ThirdPartyYouTube;
import proxy.youtube_media_library.video.Video;

import java.util.HashMap;

/**
 * A caching proxy for youtube video
 */
public class YoutubeCacheProxy implements IThirdPartyYoutubeLib {
    private final IThirdPartyYoutubeLib youtubeService;
    private HashMap<String, Video> cachePopular = new HashMap<>();
    private final HashMap<String, Video> cacheAll = new HashMap<>();

    public YoutubeCacheProxy() {
        this.youtubeService = new ThirdPartyYouTube();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}
