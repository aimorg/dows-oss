package org.dows.oss.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.oss.entity.OssDownloadEntity;
import org.dows.oss.mapper.OssDownloadMapper;

@Component
public class OssDownloadDao extends CrudDaoImpl<OssDownloadMapper,OssDownloadEntity>{

}