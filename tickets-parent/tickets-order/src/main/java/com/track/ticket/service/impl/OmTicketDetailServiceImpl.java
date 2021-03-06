package com.track.ticket.service.impl;

import com.track.data.domain.po.ticket.OmTicketDetailPo;
import com.track.data.mapper.ticket.OmTicketDetailMapper;
import com.track.ticket.service.IOmTicketDetailService;
import com.track.core.base.service.AbstractService;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 门票详情信息 服务实现类
 * </p>
 *
 * @author admin
 * @since 2019-10-25
 */
@Service
@Transactional(rollbackFor = Exception.class)
@Slf4j
public class OmTicketDetailServiceImpl extends AbstractService<OmTicketDetailMapper,OmTicketDetailPo> implements IOmTicketDetailService {

 @Autowired
 private OmTicketDetailMapper mapper;

}
