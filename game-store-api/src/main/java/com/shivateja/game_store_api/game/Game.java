package com.shivateja.game_store_api.game;

import com.shivateja.game_store_api.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Game extends BaseEntity {

    private String title;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SupportedPlatforms supportedPlatforms;
    private String coverPicture;
}

