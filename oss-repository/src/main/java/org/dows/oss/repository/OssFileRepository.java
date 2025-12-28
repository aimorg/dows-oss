package org.dows.oss.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.oss.entity.OssFileEntity;
import org.dows.oss.dao.OssFileDao;

@Component
public class OssFileRepository  extends CrudRepository<OssFileDao,OssFileEntity> {

}