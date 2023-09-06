package com.hunganh.cellphones_clientweb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductPhoto {
    private String imgUrl;
    private String imgAlt;
    private String name;
    private String caption;
}
