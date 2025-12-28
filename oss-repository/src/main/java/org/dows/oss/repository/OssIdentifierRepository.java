package org.dows.oss.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.oss.entity.OssIdentifierEntity;
import org.dows.oss.dao.OssIdentifierDao;

@Component
public class OssIdentifierRepository  extends CrudRepository<OssIdentifierDao,OssIdentifierEntity> {

}