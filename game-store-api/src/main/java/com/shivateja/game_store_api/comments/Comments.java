package com.shivateja.game_store_api.comments;


import com.shivateja.game_store_api.common.BaseEntity;
import com.shivateja.game_store_api.game.Game;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Comments extends BaseEntity {


    private String content;

    @ManyToOne
    @JoinColumn(name ="game_id")
    private Game game;
}
