package com.kuliah.wikisejarah;

public class SejarahDBModel {
    private String name;
    private String detail;
    private String wiki;
    private String[] tokoh;
    private String[] tokohDdetail;
    private int[] tokohPhoto;
    private String[] timeline;
    private String[] timelineDdetail;
    private int photo;
    private String latar;
    private int photoLatar;
    private double lat;
    private double lng;

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getLatar() {
        return latar;
    }

    public void setLatar(String latar) {
        this.latar = latar;
    }

    public int getPhotoLatar() {
        return photoLatar;
    }

    public void setPhotoLatar(int photoLatar) {
        this.photoLatar = photoLatar;
    }

    public String getWiki() {
        return wiki;
    }

    public void setWiki(String wiki) {
        this.wiki = wiki;
    }

    public String[] getTokohDdetail() {
        return tokohDdetail;
    }

    public void setTokohDdetail(String[] tokohDdetail) {
        this.tokohDdetail = tokohDdetail;
    }

    public int[] getTokohPhoto() {
        return tokohPhoto;
    }

    public void setTokohPhoto(int[] tokohPhoto) {
        this.tokohPhoto = tokohPhoto;
    }

    public String[] getTimeline() {
        return timeline;
    }

    public void setTimeline(String[] timeline) {
        this.timeline = timeline;
    }

    public String[] getTimelineDdetail() {
        return timelineDdetail;
    }

    public void setTimelineDdetail(String[] timelineDdetail) {
        this.timelineDdetail = timelineDdetail;
    }

    public String[] getTokoh() {
        return tokoh;
    }

    public void setTokoh(String[] tokoh) {
        this.tokoh = tokoh;
    }

    public String[] getTokohDetail() {
        return tokohDdetail;
    }

    public void setTokohDetail(String[] tokohDdetail) {
        this.tokohDdetail = tokohDdetail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
