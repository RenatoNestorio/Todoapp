/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Util.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import model.Task;

/**
 *
 * @author renat
 */
public class TaskController {
    
    /**
     * @param task
     * @throws SQLException
     */
    public void save(Task task) throws SQLException{
    
        String sql = "INSERT INTO TASKS (idPoject, name, description, completed, note,deadline, createdAt, updateAt) VALUES (?,?,?,?,?,?,?,?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement (sql);
            statement.setInt(1, task.getidProject());
            statement.setString(2, task.getname());
            statement.setString(3,task.getDescription());
            statement.setBoolean(4, task.isIscompleted());
            statement.setString(5, task.getnotes());
            statement.setDate(6, new Date(task.getDeadline().getTime()));
            statement.setDate(7, new Date(task.getCreateadAt().getTime()));
            statement.setDate(8, new Date(task.getUpdatedAt().getTime ()));
            statement.execute();         
        
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao salvar a tarefa" + ex.getMessage (), ex);
        } finally {
            ConnectionFactory.closeConnection(connection);
        }
        
        
        
        
    }
    
    public void update (Task task){
    
    }
    
    public void removeById (int taskId) throws SQLException{
        
        String sql = "DELETE FROM task WHERE id = ? ";
        
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, taskId);
            statement.execute();       
        } catch (Exception e) {
            throw new SQLException ("Erro ao deletar a tarefa");  
        } finally {
            ConnectionFactory.closeConnection(conn);
        
        }
            
    
    }
    
    public List<Task> getAll(int idProject){
    
        return null;
    
    }
    
    
}
