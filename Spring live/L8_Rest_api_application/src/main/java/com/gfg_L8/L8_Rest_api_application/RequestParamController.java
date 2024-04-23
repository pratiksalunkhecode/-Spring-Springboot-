package com.gfg_L8.L8_Rest_api_application;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RequestParamController {

    @RequestMapping("/test")
    public String hello(){
        return "Work my api";
    }

    /*
    we can give input using 3 ways
    1.Request body
    2.path variable
    3.Request param
     */

    @RequestMapping("/mypathname/{name}")
    public String pathvariableexample(@PathVariable("name") String name1){
        return "Hello "+name1;
    }

    //https://www.amazon.in/Nokia-Mobiles/b?ie=UTF8&node=4363184031
    //Nokia-Mobiles - Path Variable
    @RequestMapping("/mypathname/{id}/{name}")
    public String pathexample2(@PathVariable("name") String name, @PathVariable int id)
    {
          return "Hello im "+name+" with id: "+id;
    }

    //https://www.amazon.in/Nokia-Mobiles/b?ie=UTF8&node=4363184031
    //https://www.amazon.in/<Path Variable>/b?<Request Param> & <Request Param>
    @RequestMapping("/")
    public String requestparamexample(@RequestParam String name){
        return "Hello "+name;
    }

    @RequestMapping("/mobile/{model}/{number}")
    public String pathex2(@PathVariable String model, @PathVariable int number){
        return "im using "+model+" and the number of this model is "+number;
    }

    @RequestMapping("/ecom")
    public String reparameg(@RequestParam(required = false) String name, @RequestParam String category, @RequestParam double price){
        return "my new mobile is "+name+"and the category is "+category+"and the main part price "+price;
    }


    @GetMapping("/student")
    public Student getData(){
        Student s= new Student(1,"Pratik",12);
        return s;
    }

    @PostMapping("/post")
    public String poststudent(@RequestBody Student student){
        System.out.println(student);
        return student.toString();
    }

    @PostMapping("/post2")
    public String posttwo(@RequestBody Student student){
        System.out.println(student);
        return student.toString();
    }


}

/*
PATH Variable

Suppose you're building an online library application where users can access information about books.
Your application provides an API for clients to retrieve details about specific books.

Your API might have the following endpoint for retrieving details about a book:

GET /books/{bookId}

/books is the base URL for accessing book-related resources.
{bookId} is a path variable representing the unique identifier of a book.

Now, let's say a client wants to view details about a book with the ID 9780735619678. They would construct the following URL:
 GET /books/9780735619678

2. also relate ecommerce web site
go to the ec site and searching mobile
//https://www.amazon.in/Nokia-Mobiles/b?ie=UTF8&node=4363184031
Nokia-Mobile is <Path Variable>
*/

/*
Request Param

Suppose you're building an e-commerce website with a product catalog, and you want to implement a search functionality that allows
users to find products based on various criteria such as name, category, price range, etc.

GET /products?category=electronics&price_range=100-500

/products is the endpoint for accessing product resources.
category is a request parameter key, specifying the category of products to search for (in this case, "electronics").
price_range is another request parameter key, specifying the price range of products to search for (in this case, products with prices between $100 and $500).


 */

