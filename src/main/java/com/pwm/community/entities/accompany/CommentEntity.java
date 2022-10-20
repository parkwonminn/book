package com.pwm.community.entities.accompany;

import java.util.Date;
import java.util.Objects;

public class CommentEntity {
    public static final String ATTRIBUTE_NAME = "accompanyComment";
    public static final String ATTRIBUTE_NAME_PLURAL = "accompanyComments";

    public CommentEntity build() {
        return new CommentEntity();
    }
    private int index;
    private String comment;
    private Date createdAt;
    private String userId;
    private int postId;
    private int commentLike;

    public CommentEntity() {
    }

    public CommentEntity(int index, String comment, Date createdAt, String userId, int postId, int commentLike) {
        this.index = index;
        this.comment = comment;
        this.createdAt = createdAt;
        this.userId = userId;
        this.postId = postId;
        this.commentLike = commentLike;
    }

    public int getIndex() {
        return index;
    }

    public CommentEntity setIndex(int index) {
        this.index = index;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public CommentEntity setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public CommentEntity setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public CommentEntity setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public int getPostId() {
        return postId;
    }

    public CommentEntity setPostId(int postId) {
        this.postId = postId;
        return this;
    }

    public int getCommentLike() {
        return commentLike;
    }

    public CommentEntity setCommentLike(int commentLike) {
        this.commentLike = commentLike;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentEntity that = (CommentEntity) o;
        return index == that.index;
    }

    @Override
    public int hashCode() {
        return Objects.hash(index);
    }
}
