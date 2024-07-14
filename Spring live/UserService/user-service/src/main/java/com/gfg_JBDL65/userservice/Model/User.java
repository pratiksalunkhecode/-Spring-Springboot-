package com.gfg_JBDL65.userservice.Model;

import io.micrometer.common.util.internal.logging.InternalLogger;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.sql.Date;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class User implements Serializable{

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private int userId;
     private String name;
     private String email;
     private String password;
     private String mobile;

     @CreationTimestamp
     private Date createdOn;

     @UpdateTimestamp
     private Date updatedOn;

     private String Authority;

}
