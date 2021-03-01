package com.shanghai.shop.order.service.impl;

import com.shanghai.shop.order.entity.OmsOrderItem;
import com.shanghai.shop.order.mapper.OmsOrderItemMapper;
import com.shanghai.shop.order.service.IOmsOrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单项信息 服务实现类
 * </p>
 *
 * @author caizhengjun
 * @since 2021-03-01
 */
@Service
public class OmsOrderItemServiceImpl extends ServiceImpl<OmsOrderItemMapper, OmsOrderItem> implements IOmsOrderItemService {

}
