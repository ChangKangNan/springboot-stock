package com.example.springbootstock.dubbo;

import com.example.springbootcommonservice.dto.CommodityDTO;
import com.example.springbootcommonservice.dubbo.StockDubboService;
import com.example.springbootcommonservice.response.ObjectResponse;
import com.example.springbootstock.service.ITStockService;
import io.seata.core.context.RootContext;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: heshouyou
 * @Description
 * @Date Created in 2019/1/23 16:13
 */
@DubboService
@Slf4j
@Service
public class StockDubboServiceImpl implements StockDubboService {

    @Autowired
    private ITStockService stockService;

    @Override
    public ObjectResponse decreaseStock(CommodityDTO commodityDTO) {
        log.info("全局事务id ：" + RootContext.getXID());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return stockService.decreaseStock(commodityDTO);
    }
}
