package com.pwm.community.mappers;

import com.pwm.community.entities.accompany.ArticleEntity;
import com.pwm.community.entities.accompany.CommentEntity;

public interface IAccompanyMapper {

    int insertArticle(ArticleEntity article);

    int insertComment(CommentEntity comment);
}
