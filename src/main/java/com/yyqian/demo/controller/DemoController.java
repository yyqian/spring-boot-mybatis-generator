package com.yyqian.demo.controller;

import com.yyqian.demo.domain.Post;
import com.yyqian.demo.domain.PostExample;
import com.yyqian.demo.domain.PostWithBLOBs;
import com.yyqian.demo.mapper.PostMapper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by yyqian on 3/28/16.
 */
@RestController
public class DemoController {

  @Autowired
  private PostMapper postMapper;

  @RequestMapping(value = "/api/post/{id}", method = GET)
  public PostWithBLOBs readPost(@PathVariable("id") Long id) {
    return postMapper.selectByPrimaryKey(id);
  }

  @RequestMapping(value = "/api/post", method = GET)
  public List<Post> postList() {
    PostExample postExample = new PostExample();
    postExample.setDistinct(true);
    return postMapper.selectByExampleWithRowbounds(postExample, new RowBounds());
  }
}
