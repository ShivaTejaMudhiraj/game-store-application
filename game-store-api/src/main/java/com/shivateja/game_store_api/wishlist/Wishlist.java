package com.shivateja.game_store_api.wishlist;


import com.shivateja.game_store_api.common.BaseEntity;
import com.shivateja.game_store_api.game.Game;
import com.shivateja.game_store_api.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
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
public class Wishlist extends BaseEntity {

    private String name;

    @OneToOne
    private User user;

    @ManyToMany(mappedBy = "wishlists",fetch =  FetchType.EAGER)
    private List<Game> gameList;


}
