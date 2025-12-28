package org.dows.oss.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.oss.entity.OssMetricEntity;
import org.dows.oss.mapper.OssMetricMapper;

@Component
public class OssMetricDao extends CrudDaoImpl<OssMetricMapper,OssMetricEntity>{

}