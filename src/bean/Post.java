package bean;

public class Post {

    private int id; //id

    private int authorId; //作者id

    private String title; //帖子标题

    private String content; //帖子内容

    private int categoryId; //问题分类  0 待回答问题  1 最新问题  2 最热门问题

    private int isDelete; //是否删除 0 未删除  1 已删除

}
