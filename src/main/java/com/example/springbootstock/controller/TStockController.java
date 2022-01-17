package com.example.springbootstock.controller;

import com.example.springbootcommonservice.dto.CommodityDTO;
import com.example.springbootcommonservice.response.ObjectResponse;
import com.example.springbootstock.service.ITStockService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * * @author lidong
 *
 * @since 2019-09-04
 */
@RestController
@RequestMapping("/stock")
@Slf4j
public class TStockController {

    @Autowired
    private ITStockService stockService;

    /**
     * 扣减库存
     */
    @PostMapping("dec_stock")
    ObjectResponse decreaseStock(@RequestBody CommodityDTO commodityDTO) {
        log.info("请求库存微服务：{}", commodityDTO.toString());
        return stockService.decreaseStock(commodityDTO);
    }
}

