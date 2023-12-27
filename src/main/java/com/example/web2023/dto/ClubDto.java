package com.example.web2023.dto;


import com.example.web2023.model.Club;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ClubDto  {

    private Long id;
    @NotEmpty(message = "Необходимо указать название клуба.")
    private String title;
    @NotEmpty(message = "Ссылка на фото не должна быть пустой")
    private String photoUrl;
    @NotEmpty(message = "Содержимое не должно быть пустым.")
    private String content;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
}
