package ru.micron.patterns.Deputy;

import java.util.Map;

public interface ThirdPartyYouTubeLib {

  Map<String, Video> popularVideos();

  Video getVideo(String videoId);
}
