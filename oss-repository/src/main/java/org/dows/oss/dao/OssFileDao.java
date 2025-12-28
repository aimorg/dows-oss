package org.dows.oss.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.oss.entity.OssFileEntity;
import org.dows.oss.mapper.OssFileMapper;

@Component
public class OssFileDao extends CrudDaoImpl<OssFileMapper,OssFileEntity>{

}