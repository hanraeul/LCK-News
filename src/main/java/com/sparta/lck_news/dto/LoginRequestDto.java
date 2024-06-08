package com.sparta.lck_news.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class LoginRequestDto {

  @NotBlank
//  @Pattern()
  private String username;

  @NotBlank
  //  @Pattern()
  private String password;
}
