package org.dows.oss.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.oss.entity.OssSettingEntity;
import org.dows.oss.mapper.OssSettingMapper;

@Component
public class OssSettingDao extends CrudDaoImpl<OssSettingMapper,OssSettingEntity>{

}