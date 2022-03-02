package com.example.naverRestaurant.naver;

import com.example.naverRestaurant.naver.dto.SearchImageReq;
import com.example.naverRestaurant.naver.dto.SearchLocalReq;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;


@SpringBootTest
class NaverClientTest {

    @Autowired
    private NaverClient naverClient;

    @Test
    public void searchLocalTest() {

        var search = new SearchLocalReq();
        search.setQuery("갈비집");

        var result = naverClient.localSearch(search);
        System.out.println(result);
    }

    @Test
    public void searchImageTest() {
        var search=new SearchImageReq();
        search.setQuery("갈비집");

        var result=naverClient.searchImage(search);
        System.out.println(result);

    }

}