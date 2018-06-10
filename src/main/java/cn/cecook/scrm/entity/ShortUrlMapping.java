package cn.cecook.scrm.entity;

public class ShortUrlMapping extends ShortUrlMappingKey {
    /** */
    private Integer isDeleted;

    /** 短链接*/
    private String shortUrl;

    /** 长链接*/
    private String longUrl;

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl == null ? null : shortUrl.trim();
    }

    public String getLongUrl() {
        return longUrl;
    }

    public void setLongUrl(String longUrl) {
        this.longUrl = longUrl == null ? null : longUrl.trim();
    }
}