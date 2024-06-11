package com.sparta.lck_news.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class DeactivateRequestDto {

  private int password;

  private String gisdnr;


  private String pl;
}
