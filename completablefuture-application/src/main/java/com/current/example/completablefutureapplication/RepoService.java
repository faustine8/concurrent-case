package com.current.example.completablefutureapplication;

import org.springframework.stereotype.Service;

import java.util.Random;


@Service
public class RepoService {

    /**
     * 查询指定商品库存
     * @param goodsId
     * @return
     */
    public Integer getRepoByGoodsId(Integer goodsId){
        return new Random().nextInt(1000);
    }
}
