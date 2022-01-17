package com.example.springbootstock.service;

import com.example.springbootcommonservice.dto.CommodityDTO;
import com.example.springbootcommonservice.response.ObjectResponse;

/**
 * 仓库服务
 *
 * * @author lidong
 *
 * @since 2019-09-04
 */
public interface ITStockService {

    /**
     * 扣减库存
     */
    ObjectResponse decreaseStock(CommodityDTO commodityDTO);
}
