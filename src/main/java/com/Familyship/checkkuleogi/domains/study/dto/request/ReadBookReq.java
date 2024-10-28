package com.Familyship.checkkuleogi.domains.study.dto.request;

// @Setter 사용 X, DTO는 값 전달만을 위해 쓰이는 객체, 데이터 전달 책임만 갖도록 구조를 단순화
public record ReadBookReq(Long bookIdx, int startPage , int endPage) {}