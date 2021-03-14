package ru.micron.patterns.Deputy;

import java.util.HashMap;
import java.util.Map;

public class YouTubeCacheProxy implements ThirdPartyYouTubeLib {

  private final ThirdPartyYouTubeLib youtubeService;
  private Map<String, Video> cachePopular = new HashMap<>();
  private final Map<String, Video> cacheAll = new HashMap<>();

  public YouTubeCacheProxy() {
    this.youtubeService = new ThirdPartyYouTubeClass();
  }

  @Override
  public Map<String, Video> popularVideos() {
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
