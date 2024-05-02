package com.Redis1.SpringBootWithRedis.enitity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product implements Serializable {


    private int id;
    private String name;
    private String version;
    private String CompanyName;

}
