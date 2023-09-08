package com.current.example.completablefutureapplication;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Service
public class CommentService {
    /**
     * 返回指定商品的评论
     * @return
     */
    public List<String> getCommentsByGoodsId(Integer goodsId){
        return Arrays.asList("好","一般","很好");
    }
}
