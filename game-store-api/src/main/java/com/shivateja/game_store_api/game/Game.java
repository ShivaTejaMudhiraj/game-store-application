package com.shivateja.game_store_api.game;

import com.shivateja.game_store_api.category.Category;
import com.shivateja.game_store_api.comments.Comments;
import com.shivateja.game_store_api.common.BaseEntity;
import com.shivateja.game_store_api.wishlist.Wishlist;
import jakarta.persistence.*;
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
public class Game extends BaseEntity {

    private String title;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SupportedPlatforms supportedPlatforms;
    private String coverPicture;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    @OneToMany(mappedBy = "game")
    private List<Comments> comments;

    @ManyToMany(cascade={CascadeType.PERSIST,CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JoinTable(
            name="game_wishlist",
            joinColumns = {
                    @JoinColumn(
                            name="game_id"
                    )
            },
            inverseJoinColumns ={
                    @JoinColumn(name= "wishlist_id")
            }
    )
    private List<Wishlist> wishlists;

    public void addWishlist(Wishlist wishlist) {
        this.wishlists.add(wishlist);
        wishlist.getGameList().add(this);
    }

    public void removeWishlist(Wishlist wishlist) {
        this.wishlists.remove(wishlist);
        wishlist.getGameList().remove(this);
    }
}

