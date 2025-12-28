package org.dows.oss.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.oss.entity.OssIdentifierEntity;
import org.dows.oss.mapper.OssIdentifierMapper;

@Component
public class OssIdentifierDao extends CrudDaoImpl<OssIdentifierMapper,OssIdentifierEntity>{

}