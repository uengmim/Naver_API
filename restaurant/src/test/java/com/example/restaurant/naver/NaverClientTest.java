package com.example.restaurant.naver;

import com.example.restaurant.naver.dto.SearchLocalReq;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class NaverClientTest {

    @Autowired
    private NaverClient naverClient;

    @Test
    public void localSearchTest(){

        var search = new SearchLocalReq();
        search.setQuery("삼겹살");

        var result  = naverClient.localSearch(search);
        System.out.println(result);
    }
}
