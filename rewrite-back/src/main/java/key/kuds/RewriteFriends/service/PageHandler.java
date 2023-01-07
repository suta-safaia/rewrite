package key.kuds.RewriteFriends.service;

import key.kuds.RewriteFriends.dto.query.PagePerInfoQuery;
import key.kuds.RewriteFriends.entity.PageInfo;

/**
 * 首页信息处理服务
 *
 * @author KUD
 **/
public interface PageHandler {

    PageInfo getPageInfo(PagePerInfoQuery pagePerInfoQuery);
}
