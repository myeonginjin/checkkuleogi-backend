package com.Familyship.checkkuleogi.domains.child.dto.request;

import lombok.Getter;

@Getter
public class CreateChildRequestMbtiDTO {
    private String childName;
    private int[] surveys;
}