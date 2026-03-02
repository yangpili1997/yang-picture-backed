package com.yang.yangpicturebacked.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yang.yangpicturebacked.exception.PictureUploadRequest;
import com.yang.yangpicturebacked.model.dto.picture.PictureQueryRequest;
import com.yang.yangpicturebacked.model.dto.picture.PictureReviewRequest;
import com.yang.yangpicturebacked.model.dto.picture.PictureUploadByBatchRequest;
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
    PictureVO uploadPicture(Object inputSource,
                            PictureUploadRequest pictureUploadRequest,
                            User loginUser);

    QueryWrapper<Picture> getQueryWrapper(PictureQueryRequest pictureQueryRequest);

    PictureVO getPictureVO(Picture picture, HttpServletRequest request);

    Page<PictureVO> getPictureVOPage(Page<Picture> picturePage, HttpServletRequest request);

    void validPicture(Picture picture);

    /**
     * 图片审核
     *
     * @param pictureReviewRequest
     * @param loginUser
     */
    void doPictureReview(PictureReviewRequest pictureReviewRequest, User loginUser);

    void fillReviewParams(Picture picture, User loginUser);

    /**
     * 批量抓取和创建图片
     *
     * @param pictureUploadByBatchRequest
     * @param loginUser
     * @return 成功创建的图片数
     */
    Integer uploadPictureByBatch(
            PictureUploadByBatchRequest pictureUploadByBatchRequest,
            User loginUser
    );

}
