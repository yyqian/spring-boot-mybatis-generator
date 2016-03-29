package com.yyqian.demo.mapper;

import com.yyqian.demo.domain.Post;
import com.yyqian.demo.domain.PostExample;
import com.yyqian.demo.domain.PostWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PostMapper {
    int countByExample(PostExample example);

    int deleteByExample(PostExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PostWithBLOBs record);

    int insertSelective(PostWithBLOBs record);

    List<PostWithBLOBs> selectByExampleWithBLOBsWithRowbounds(PostExample example, RowBounds rowBounds);

    List<PostWithBLOBs> selectByExampleWithBLOBs(PostExample example);

    List<Post> selectByExampleWithRowbounds(PostExample example, RowBounds rowBounds);

    List<Post> selectByExample(PostExample example);

    PostWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PostWithBLOBs record, @Param("example") PostExample example);

    int updateByExampleWithBLOBs(@Param("record") PostWithBLOBs record, @Param("example") PostExample example);

    int updateByExample(@Param("record") Post record, @Param("example") PostExample example);

    int updateByPrimaryKeySelective(PostWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PostWithBLOBs record);

    int updateByPrimaryKey(Post record);
}