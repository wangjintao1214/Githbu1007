package com.kgc.springssm.service.impl;

import com.kgc.springssm.mapper.AssetsMapper;
import com.kgc.springssm.pojo.Assets;
import com.kgc.springssm.pojo.AssetsExample;
import com.kgc.springssm.service.AssetsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-07 12:55
 */
@Service
public class AssetsServiceImpl  implements AssetsService{
    @Resource
    AssetsMapper assetsMapper;

    @Override
    public List<Assets> selectAllByAssettype(String assetid,String assettype) {
        AssetsExample example=new AssetsExample();
        AssetsExample.Criteria criteria = example.createCriteria();
        if(assettype.isEmpty()==false){
            criteria.andAssettypeLike(assettype);
        }
        if(assetid.isEmpty()==false){
            criteria.andAssetidLike(assetid);
        }
        List<Assets> assets = assetsMapper.selectByExample(example);
        return assets;
    }

    @Override
    public int add(Assets assets) {
        int i = assetsMapper.insertSelective(assets);
        return i;
    }
}
