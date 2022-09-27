/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author renat
 */
public class Task {
    
    private int id;
    private int idproject;
    private String name;
    private String description;
    private String note;
    private boolean iscompleted;
    private Date deadline;
    private Date createadAt;
    private Date updatedAt;

    public Task(int id, int idproject, String name, String description, String note, boolean iscompleted, Date deadline, Date createadAt, Date updatedAt) {
        this.id = id;
        this.idproject = idproject;
        this.name = name;
        this.description = description;
        this.note = note;
        this.iscompleted = iscompleted;
        this.deadline = deadline;
        this.createadAt = createadAt;
        this.updatedAt = updatedAt;
    }

    public Task () {
        this.createadAt = new Date();   
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdproject() {
        return idproject;
    }

    public void setIdproject(int idproject) {
        this.idproject = idproject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public boolean isIscompleted() {
        return iscompleted;
    }

    public void setIscompleted(boolean iscompleted) {
        this.iscompleted = iscompleted;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getCreateadAt() {
        return createadAt;
    }

    public void setCreateadAt(Date createadAt) {
        this.createadAt = createadAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "task{" + "id=" + id + ", idproject=" + idproject + ", name=" + name + ", description=" + description + ", note=" + note + ", iscompleted=" + iscompleted + ", deadline=" + deadline + ", createadAt=" + createadAt + ", updatedAt=" + updatedAt + '}';
    }
    
    
    
    
    
    
}
