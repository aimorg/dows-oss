package org.dows.oss.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.oss.entity.OssBucketEntity;
import org.dows.oss.dao.OssBucketDao;

@Component
public class OssBucketRepository  extends CrudRepository<OssBucketDao,OssBucketEntity> {

}