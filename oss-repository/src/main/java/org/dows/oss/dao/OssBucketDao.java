package org.dows.oss.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.oss.entity.OssBucketEntity;
import org.dows.oss.mapper.OssBucketMapper;

@Component
public class OssBucketDao extends CrudDaoImpl<OssBucketMapper,OssBucketEntity>{

}