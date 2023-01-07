package key.kuds.RewriteFriends.entity;

import java.util.List;

/**
 * 页面预览信息
 *
 * @author KUD
 **/
public class PageInfo {

    /**总页数 */
    private int totalPage;
    /**当前页*/
    private int curPage;
    /**每页人数*/
    private int pageSize;
    /**概览信息*/
    List<FriendPerInfo> friendPerInfoList;

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<FriendPerInfo> getFriendPerInfoList() {
        return friendPerInfoList;
    }

    public void setFriendPerInfoList(List<FriendPerInfo> friendPerInfoList) {
        this.friendPerInfoList = friendPerInfoList;
    }
}
