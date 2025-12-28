package org.dows.oss.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.oss.entity.OssMetricEntity;
import org.dows.oss.dao.OssMetricDao;

@Component
public class OssMetricRepository  extends CrudRepository<OssMetricDao,OssMetricEntity> {

}