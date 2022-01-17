package com.example.springbootstock.service;

import com.example.springbootcommonservice.dto.CommodityDTO;
import com.example.springbootcommonservice.enums.RspStatusEnum;
import com.example.springbootcommonservice.response.ObjectResponse;
import com.example.springbootstock.mapper.TStockMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 库存服务实现类
 * </p>
 *
 * * @author lidong
 *
 * @since 2019-09-04
 */
@Service
public class TStockServiceImpl  implements ITStockService {
    @Autowired
    private TStockMapper baseMapper;

    @Override
    public ObjectResponse decreaseStock(CommodityDTO commodityDTO) {
        int stock = baseMapper.decreaseStock(commodityDTO.getCommodityCode(), commodityDTO.getCount());
        ObjectResponse<Object> response = new ObjectResponse<>();
        if (stock > 0) {
            response.setStatus(RspStatusEnum.SUCCESS.getCode());
            response.setMessage(RspStatusEnum.SUCCESS.getMessage());
            return response;
        }

        response.setStatus(RspStatusEnum.FAIL.getCode());
        response.setMessage(RspStatusEnum.FAIL.getMessage());
        return response;
    }
}
