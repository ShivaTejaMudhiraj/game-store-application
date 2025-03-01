package com.shivateja.game_store_api.user;


import com.shivateja.game_store_api.common.BaseEntity;
import com.shivateja.game_store_api.gamerequest.GameRequest;
import com.shivateja.game_store_api.notification.Notification;
import com.shivateja.game_store_api.wishlist.Wishlist;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
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
@Table(name = "users")
public class User extends BaseEntity {

    private String firstName;
    private String lastName;
    private String email;
    private String profilePictureUrl;
    @OneToOne(mappedBy = "user")
    private Wishlist wishlist;

    @OneToMany(mappedBy = "user")
    private List<Notification> notification;

    @OneToMany(mappedBy = "user")
    private List<GameRequest> gameRequests;

}
