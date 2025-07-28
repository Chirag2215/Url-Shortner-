package com.info.urlshortner.Dto;



import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Urldto {
    private String original;
 //   private String shorturl;
//    private Date currnetdate;
    private LocalDateTime expiredate;
}
