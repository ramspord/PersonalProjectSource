package com.ramspord.admin.dto;

import com.ramspord.admin.web.dto.HelloResponseDto;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class HelloResponseDtoTest {
    @Test
    public void 롬복_기능_테스트(){
     String name = "test";
     int amount = 1000;

     HelloResponseDto dto = new HelloResponseDto(name, amount);

     assertThat(dto.getName()).isEqualTo(name);
     assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
