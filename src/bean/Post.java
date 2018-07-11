package bean;

import java.util.Date;

public class Post {

    private int pid; //id

    private int authorId; //作者id

    private String title; //帖子标题

    private String content; //帖子内容

    private Date createTime; //创建时间

    private int categoryId; //问题分类  0 待回答问题  1 最新问题  2 最热门问题

    private int isDelete; //是否删除 0 未删除  1 已删除

    public Post(int pid, int authorId, String title, String content, Date createTime, int categoryId, int isDelete) {
        this.pid = pid;
        this.authorId = authorId;
        this.title = title;
        this.content = content;
        this.createTime = createTime;
        this.categoryId = categoryId;
        this.isDelete = isDelete;
    }

    public int getPid() {
        return pid;
    }

    public int getAuthorId() {
        return authorId;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public int getIsDelete() {
        return isDelete;
    }
}
