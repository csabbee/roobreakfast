package com.acme.karcsi.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import com.acme.karcsi.FoodType;
import javax.persistence.Enumerated;
import org.springframework.roo.addon.json.RooJson;

@RooJavaBean
@RooToString
@RooJpaEntity(identifierField = "id")
@RooJson
public class Food {

    /**
     */
    @NotNull
    private String name;

    /**
     */
    private String description;

    /**
     */
    private Float price;

    /**
     */
    @Enumerated
    private FoodType type;
}
