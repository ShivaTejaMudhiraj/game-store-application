package com.shivateja.game_store_api.category;


import com.shivateja.game_store_api.common.BaseEntity;
import com.shivateja.game_store_api.game.Game;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Category extends BaseEntity {

    private String name;
    private String description;

    @OneToMany(mappedBy = "category")
    private List<Game> games;


    //auditing fields: creationdate , created by.
}
