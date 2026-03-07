package com.yang.yangpicturebacked.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yang.yangpicturebacked.model.dto.space.SpaceAddRequest;
import com.yang.yangpicturebacked.model.dto.space.SpaceQueryRequest;
import com.yang.yangpicturebacked.model.entity.Space;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.yangpicturebacked.model.entity.User;
import com.yang.yangpicturebacked.model.vo.SpaceVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author yangli
* @description 针对表【space(空间)】的数据库操作Service
* @createDate 2026-03-04 11:40:02
*/
public interface SpaceService extends IService<Space> {

    long addSpace(SpaceAddRequest spaceAddRequest, User loginUser);

    void validSpace(Space space, boolean add);

    QueryWrapper<Space> getQueryWrapper(SpaceQueryRequest pictureQueryRequest);

    SpaceVO getSpaceVO(Space picture, HttpServletRequest request);

    Page<SpaceVO> getSpaceVOPage(Page<Space> picturePage, HttpServletRequest request);

    void fillSpaceBySpaceLevel(Space space);

    void checkSpaceAuth(User loginUser, Space space);
}
