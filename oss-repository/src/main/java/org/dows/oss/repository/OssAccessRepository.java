package org.dows.oss.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.oss.entity.OssAccessEntity;
import org.dows.oss.dao.OssAccessDao;

@Component
public class OssAccessRepository  extends CrudRepository<OssAccessDao,OssAccessEntity> {

}