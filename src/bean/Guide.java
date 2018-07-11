package bean;

import java.util.Date;

public class Guide {

    private int gid; //id

    private String title; //标题

    private String content; //内容

    private String place; //目的地

    private int theme;  //主题  0 游记 1 攻略

    private String authorId; //作者id

    private int thumbs;  //获赞数

    private int beCollected;  //收藏数

    private int beCommented;  //评论数

    private int isDelete; //是否删除  0 未删除 1 已删除

    private Date createTime; //发布时间

    private Date updateTime; //最后更新时间

    public Guide(int gid, String title, String content, String place, int theme, String authorId, int thumbs, int beCollected, int beCommented, int isDelete, Date createTime, Date updateTime) {
        this.gid = gid;
        this.title = title;
        this.content = content;
        this.place = place;
        this.theme = theme;
        this.authorId = authorId;
        this.thumbs = thumbs;
        this.beCollected = beCollected;
        this.beCommented = beCommented;
        this.isDelete = isDelete;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public int getGid() {
        return gid;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getPlace() {
        return place;
    }

    public int getTheme() {
        return theme;
    }

    public String getAuthorId() {
        return authorId;
    }

    public int getThumbs() {
        return thumbs;
    }

    public int getBeCollected() {
        return beCollected;
    }

    public int getBeCommented() {
        return beCommented;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }
}
