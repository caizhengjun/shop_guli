package com.shanghai.shop.order.service.impl;

import com.shanghai.shop.order.entity.OmsOrder;
import com.shanghai.shop.order.mapper.OmsOrderMapper;
import com.shanghai.shop.order.service.IOmsOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单 服务实现类
 * </p>
 *
 * @author caizhengjun
 * @since 2021-03-01
 */
@Service
public class OmsOrderServiceImpl extends ServiceImpl<OmsOrderMapper, OmsOrder> implements IOmsOrderService {

}
