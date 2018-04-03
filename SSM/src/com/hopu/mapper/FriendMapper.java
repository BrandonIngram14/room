package com.hopu.mapper;

import java.util.List;

import com.hopu.bean.Friend;
import com.hopu.bean.User;

public interface FriendMapper {
	
	//���Ӻ���
	public void addFriend(Friend friend);
	
	//������������
	public List<User> findAllF(Friend friend);
	 
	//��ѯ������Ϣ
	public Friend findFriend(Friend friend);
	
	//�޸ĺ���״̬
	public void updateFriend(Friend friend);
	
	//ɾ������
	public void deleteFriend(Friend friend);
}