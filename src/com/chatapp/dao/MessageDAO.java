package com.chatapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.chatapp.model.Message;

@Component("messageDao")
public class MessageDAO {
	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJdbcTemplate(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	
	public List<Message> getAllMessages(){
		
		return jdbcTemplate.query("select * from ChatApp.Message", new RowMapper<Message>(){

			@Override
			public Message mapRow(ResultSet rs, int rowNum)
					throws SQLException {
				Message message = new Message();
				
				message.setMessage(rs.getString("message"));
				message.setFromUserId(rs.getString("fromUserId"));
				message.setToUserId(rs.getString("toUserId"));
				message.setSentTime(rs.getString("sentTime"));
				
				return message;
				
			}
			
		});
		
	}

}
