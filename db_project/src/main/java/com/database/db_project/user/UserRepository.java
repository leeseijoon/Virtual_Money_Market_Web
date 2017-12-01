package com.database.db_project.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {

	@Autowired
	SqlSession sqlSession;
	public List<User> findAll(User entity) {
		return sqlSession.selectList("com.database.db_project.user.findAll", entity);
	}
}
