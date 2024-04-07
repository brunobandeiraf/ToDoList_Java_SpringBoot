package br.com.brunobandeiraf.todolist.user;

import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import com.google.appengine.repackaged.org.joda.time.LocalDateTime;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
// @Data - Getters and Setters
@Entity(name = "tb_users")
public class UserModel {
    
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    //@Column(name = "username")
    private String username;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;

}
