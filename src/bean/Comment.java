package bean;

import java.util.Date;

public class Comment {

    private int cid; //id

    private int category;  //    0 攻略评论  1 帖子评论

    private int foreignId; //评论的攻略或帖子的id

    private int userId; //评论者id

    private String content; //评论内容

    private Date createTime; //评论时间

    private int isDelete; //是否删除  0 未删除  1 已删除

    public Comment(int cid, int category, int foreignId, int userId, String content, Date createTime, int isDelete) {
        this.cid = cid;
        this.category = category;
        this.foreignId = foreignId;
        this.userId = userId;
        this.content = content;
        this.createTime = createTime;
        this.isDelete = isDelete;
    }

    public int getCid() {
        return cid;
    }

    public int getCategory() {
        return category;
    }

    public int getForeignId() {
        return foreignId;
    }

    public int getUserId() {
        return userId;
    }

    public String getContent() {
        return content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public int getIsDelete() {
        return isDelete;
    }
}
