package org.wingstudio.service;

import org.wingstudio.entity.Video;

import java.util.List;

/**
 * VideoService
 * create by chenshihang on 2018/7/28
 */
public interface VideoService {

    List<List<Video>> getVideosByCategory(List<Integer> categoryIds);


    List<Video> getRecentVideos();

    List<Video> getVideosByCategoryId(int categoryId);



    Video getVideoById(int videoId);

    void setViewAmount(int videoId,int viewAmount);

    List<Video> getCollectVideosByStuId(int stuId);



}
