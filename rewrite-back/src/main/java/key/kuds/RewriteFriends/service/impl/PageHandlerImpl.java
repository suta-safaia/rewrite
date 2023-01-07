package key.kuds.RewriteFriends.service.impl;

import key.kuds.RewriteFriends.dto.query.PagePerInfoQuery;
import key.kuds.RewriteFriends.entity.FriendPerInfo;
import key.kuds.RewriteFriends.entity.PageInfo;
import key.kuds.RewriteFriends.service.DataHandler;
import key.kuds.RewriteFriends.service.PageHandler;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 首页信息处理服务实现
 *
 * @author KUD
 **/
@Service
public class PageHandlerImpl implements PageHandler {

    @Resource
    private DataHandler dataHandler;

    @Override
    public PageInfo getPageInfo(PagePerInfoQuery pagePerInfoQuery) {
        //因为数据量太少 不选择使用分页
        List<FriendPerInfo> friendPerInfoList = dataHandler.getPagePerInfo();
        PageInfo pageInfo = new PageInfo();
        pageInfo.setFriendPerInfoList(friendPerInfoList);
        return pageInfo;
    }
}
