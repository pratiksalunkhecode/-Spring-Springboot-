package com.Redis1.SpringBootWithRedis.enitity.ProductDAO;

import com.Redis1.SpringBootWithRedis.enitity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDAO {



    private static final String HASH_KEY  = "JBDL65-Product";
 //   public static List<Object> get;

    @Autowired
    private RedisTemplate<String, Object> template;

     public Product save(Product product){
         template.opsForHash().put(HASH_KEY,product.getId(),product);
         return product;
     }

    public List<Object> getAll(){
        return template.opsForHash().values(HASH_KEY);
    }
}
