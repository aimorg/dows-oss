package org.dows.oss.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.oss.entity.OssSettingEntity;
import org.dows.oss.dao.OssSettingDao;

@Component
public class OssSettingRepository  extends CrudRepository<OssSettingDao,OssSettingEntity> {

}