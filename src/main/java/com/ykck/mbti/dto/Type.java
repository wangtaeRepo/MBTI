package com.ykck.mbti.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Type {
    private int type_id;
    private String type_name;
    private int first_category_id;
    private int second_category_id;
    private String image_url;
    private String comments;
    private String descriptions;
}
