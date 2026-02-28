package com.yang.yangpicturebacked.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yang.yangpicturebacked.exception.PictureUploadRequest;
import com.yang.yangpicturebacked.model.dto.picture.PictureQueryRequest;
import com.yang.yangpicturebacked.model.entity.Picture;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.yangpicturebacked.model.entity.User;
import com.yang.yangpicturebacked.model.vo.PictureVO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
* @author yangli
* @description 针对表【picture(图片)】的数据库操作Service
* @createDate 2026-02-28 14:15:57
*/
public interface PictureService extends IService<Picture> {

    /**
     * 上传图片
     *
     * @param multipartFile
     * @param pictureUploadRequest
     * @param loginUser
     * @return
     */
    PictureVO uploadPicture(MultipartFile multipartFile,
                            PictureUploadRequest pictureUploadRequest,
                            User loginUser);

    QueryWrapper<Picture> getQueryWrapper(PictureQueryRequest pictureQueryRequest);

    PictureVO getPictureVO(Picture picture, HttpServletRequest request);

    Page<PictureVO> getPictureVOPage(Page<Picture> picturePage, HttpServletRequest request);

    void validPicture(Picture picture);

}
