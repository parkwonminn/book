package com.pwm.community.entities.accompany;

import java.util.Date;
import java.util.Objects;

public class ArticleEntity {
    public static final String ATTRIBUTE_NAME = "accompanyArticle";
    public static final String ATTRIBUTE_NAME_PLURAL = "accompanyArticles";

    public ArticleEntity build() {
        return new ArticleEntity();
    }
    private int index;
    private String userId;
    private Date createdAt;
    private String title;
    private byte[] coverImage;
    private String coverImageMime;
    private String content;
    private int like;

    public ArticleEntity() {
    }

    public ArticleEntity(int index, String userId, Date createdAt, String title, byte[] coverImage, String coverImageMime, String content, int like) {
        this.index = index;
        this.userId = userId;
        this.createdAt = createdAt;
        this.title = title;
        this.coverImage = coverImage;
        this.coverImageMime = coverImageMime;
        this.content = content;
        this.like = like;
    }

    public int getIndex() {
        return index;
    }

    public ArticleEntity setIndex(int index) {
        this.index = index;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public ArticleEntity setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public ArticleEntity setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ArticleEntity setTitle(String title) {
        this.title = title;
        return this;
    }

    public byte[] getCoverImage() {
        return coverImage;
    }

    public ArticleEntity setCoverImage(byte[] coverImage) {
        this.coverImage = coverImage;
        return this;
    }

    public String getCoverImageMime() {
        return coverImageMime;
    }

    public ArticleEntity setCoverImageMime(String coverImageMime) {
        this.coverImageMime = coverImageMime;
        return this;
    }

    public String getContent() {
        return content;
    }

    public ArticleEntity setContent(String content) {
        this.content = content;
        return this;
    }

    public int getLike() {
        return like;
    }

    public ArticleEntity setLike(int like) {
        this.like = like;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArticleEntity that = (ArticleEntity) o;
        return index == that.index;
    }

    @Override
    public int hashCode() {
        return Objects.hash(index);
    }
}
