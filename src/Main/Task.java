/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Lenovo
 */
public class Task {
    public int id;
    public String title;
    public String description;
    public int userId;
   public Task(int id, String title, String description, int userId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.userId = userId;
    }
      public Task(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }
    public Task(String title, String description, int userId) {
        this.title = title;
        this.description = description;
        this.userId = userId;
    }
}
