package key.kuds.RewriteFriends.entity;

import java.util.Date;

/**
 * 详细的朋友信息
 *
 * @author KUD
 **/
public class FriendInfo {
    /**ID 唯一标识*/
    private String id;
    /**序号 展示排序用*/
    private int sno;
    /**姓名*/
    private String name;
    /**性别 展示颜色用*/
    private String sex;
    /**创建时间*/
    private Date createdTime;
    /**最后修改时间*/
    private Date lastUpdateTime;
    /**修改次数*/
    private int updateNum;
    /**今年修改次数*/
    private int yearUpdateNum;
    /**
     * 文字内容
     */
    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public int getUpdateNum() {
        return updateNum;
    }

    public void setUpdateNum(int updateNum) {
        this.updateNum = updateNum;
    }

    public int getYearUpdateNum() {
        return yearUpdateNum;
    }

    public void setYearUpdateNum(int yearUpdateNum) {
        this.yearUpdateNum = yearUpdateNum;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
