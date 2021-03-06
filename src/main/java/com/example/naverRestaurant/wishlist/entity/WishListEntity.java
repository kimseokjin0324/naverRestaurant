package com.example.naverRestaurant.wishlist.entity;

import com.example.naverRestaurant.db.MemoryDbEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class WishListEntity extends MemoryDbEntity {

    private String title;               //음식명,가게명
    private String category;            //카테고리
    private String address;             //주소
    private String roadAddress;         //도로명
    private String homePageLink;        //홈페이지 주소
    private String imageLink;           //음식,가게 이미지 주소
    private boolean isVisit;            //방문여부
    private LocalDateTime lastVisitDate;    //방문카운트
    private int visitCount;                 //마지막 방문일자

}
