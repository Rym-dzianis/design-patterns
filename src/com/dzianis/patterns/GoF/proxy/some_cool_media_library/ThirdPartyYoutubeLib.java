package com.dzianis.patterns.GoF.proxy.some_cool_media_library;

import java.util.HashMap;

public interface ThirdPartyYoutubeLib {
    public HashMap<String, Video> popularVideos();

    public Video getVideo(String videoId);
}
