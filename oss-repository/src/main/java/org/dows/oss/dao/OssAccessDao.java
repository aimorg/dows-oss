package org.dows.oss.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.oss.entity.OssAccessEntity;
import org.dows.oss.mapper.OssAccessMapper;

@Component
public class OssAccessDao extends CrudDaoImpl<OssAccessMapper,OssAccessEntity>{

}