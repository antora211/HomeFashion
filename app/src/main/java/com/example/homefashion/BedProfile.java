package com.example.homefashion;

public class BedProfile {

    private String id;
    private String name;
    private Long prize;
    private String url;

    public BedProfile(String id, String name, Long prize, String url) {
        this.id = id;
        this.name = name;
        this.prize = prize;
        this.url = url;
    }

    public BedProfile() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getPrize() {
        return prize;
    }

    public String getUrl() {
        return url;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrize(Long prize) {
        this.prize = prize;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
