package com.shivateja.game_store_api.comments;


import com.shivateja.game_store_api.common.BaseEntity;
import jakarta.persistence.Entity;
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


    private String comment;
}
