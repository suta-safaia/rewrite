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
        //编号修改统一三位数
        for (FriendPerInfo friendPerInfo: friendPerInfoList) {
            if (friendPerInfo.getId().length() == 1) {
                friendPerInfo.setId("00"+friendPerInfo.getId());
            }
            if (friendPerInfo.getId().length() == 2) {
                friendPerInfo.setId("0"+friendPerInfo.getId());
            }
        }
        PageInfo pageInfo = new PageInfo();
        pageInfo.setFriendPerInfoList(friendPerInfoList);
        return pageInfo;
    }
}
