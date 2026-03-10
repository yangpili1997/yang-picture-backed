package com.yang.yangpicturebacked.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yang.yangpicturebacked.model.dto.spaceuser.SpaceUserAddRequest;
import com.yang.yangpicturebacked.model.dto.spaceuser.SpaceUserQueryRequest;
import com.yang.yangpicturebacked.model.entity.SpaceUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.yangpicturebacked.model.vo.SpaceUserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author yangli
* @description 针对表【space_user(空间用户关联)】的数据库操作Service
* @createDate 2026-03-09 12:46:20
*/
public interface SpaceUserService extends IService<SpaceUser> {

    long addSpaceUser(SpaceUserAddRequest spaceUserAddRequest);

    void validSpaceUser(SpaceUser spaceUser, boolean add);

    QueryWrapper<SpaceUser> getQueryWrapper(SpaceUserQueryRequest spaceUserQueryRequest);

    SpaceUserVO getSpaceUserVO(SpaceUser spaceUser, HttpServletRequest request);

    List<SpaceUserVO> getSpaceUserVOList(List<SpaceUser> spaceUserList);
}
