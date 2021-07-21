package kh.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kh.spring.dto.MessageDTO;

@Component
public class MessageDAO {
	
	@Autowired
	private DataSource ds;
	
	public int insert(MessageDTO dto) throws Exception{
		String sql = "insert into messages values(messages_seq.nextval,?,?)";
		try(Connection con = ds.getConnection();
			PreparedStatement pstat = con.prepareStatement(sql)){
			pstat.setString(1, dto.getWriter());
			pstat.setString(2, dto.getMessage());
			
			return pstat.executeUpdate();
		}
	}
	
	public List<MessageDTO>selectAll()throws Exception{
		String sql = "select * from messages order by 1";
		try(Connection con = ds.getConnection();
			PreparedStatement pstat = con.prepareStatement(sql);
			ResultSet rs = pstat.executeQuery();){
			
			List<MessageDTO>list = new ArrayList<>();
			while(rs.next()) {
				int id = rs.getInt("id");
				String writer = rs.getString("writer");
				String message = rs.getString("message");
				
				MessageDTO dto = new MessageDTO(id,writer,message);
				list.add(dto);
			}
			return list;
		}
	}
	
	public int delete(int id) throws Exception{
		String sql = "delete from messages where id = ?";
		try(Connection con = ds.getConnection();
			PreparedStatement pstat = con.prepareStatement(sql);){
			pstat.setInt(1, id);
			
			return pstat.executeUpdate();
		}
	}
	
	public int modify(MessageDTO dto) throws Exception{
		String sql = "update messages set writer = ?, message = ? where id = ?";
		try(Connection con = ds.getConnection();
			PreparedStatement pstat = con.prepareStatement(sql);){
			pstat.setString(1,dto.getWriter());
			pstat.setString(2, dto.getMessage());
			pstat.setInt(3, dto.getId());
			
			return pstat.executeUpdate();
		}
	}

}
