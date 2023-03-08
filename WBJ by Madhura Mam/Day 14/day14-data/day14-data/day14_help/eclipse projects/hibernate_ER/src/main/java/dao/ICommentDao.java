package dao;

import pojos.Comment;

public interface ICommentDao {
String addComment(long tutId,long userId,Comment c);
}
