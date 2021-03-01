package com.shanghai.shop.user.service.impl;

import com.shanghai.shop.user.entity.UmsUser;
import com.shanghai.shop.user.mapper.UmsUserMapper;
import com.shanghai.shop.user.service.IUmsUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author caizhengjun
 * @since 2021-03-01
 */
@Service
public class UmsUserServiceImpl extends ServiceImpl<UmsUserMapper, UmsUser> implements IUmsUserService {

}
