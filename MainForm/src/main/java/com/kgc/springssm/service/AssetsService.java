package com.kgc.springssm.service;

import com.kgc.springssm.pojo.Assets;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-07 12:54
 */
public interface AssetsService {
    List<Assets> selectAllByAssettype(String assetid,String assettype);
    int add(Assets assets);
}
